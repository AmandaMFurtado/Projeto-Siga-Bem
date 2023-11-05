package com.sigabem.configuration;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

/**
 * Configuração para o Swagger/OpenAPI.
 */
@Configuration
public class SwaggerConfig {

	/**
	 * Configura e retorna as informações gerais da documentação do Swagger/OpenAPI.
	 *
	 * @return Instância de OpenAPI configurada com informações gerais.
	 */
	@Bean
	public OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("Projeto Siga Bem")
					.description("Projeto desenvolvida para calcular valor de frete.")
					.version("v0.0.1")
				.license(new License()
					.name("sigabem.com.br")
					.url("http://springdoc.org"))
				.contact(new Contact()
					.name("Siga Bem")
					.url("https://github.com/AmandaMFurtado/Projeto-SigaBem")
					.email("andaemc@gmail.com")))
				.externalDocs(new ExternalDocumentation()
					.description("Github")
					.url("https://github.com/AmandaMFurtado/Projeto-SigaBem"));
	}

	/**
	 * Cria um customizador global para adicionar respostas de API com mensagens padrão.
	 *
	 * @return Instância de OpenApiCustomiser configurada para adicionar respostas de API.
	 */
	@Bean
	public OpenApiCustomiser customerGlobalHeaderOpenApiCustomiser() {

		return openApi -> {
			openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {

				ApiResponses apiResponses = operation.getResponses();

				apiResponses.addApiResponse("200", createApiResponse("Sucesso!"));
				apiResponses.addApiResponse("201", createApiResponse("Objeto Persistido!"));
				apiResponses.addApiResponse("204", createApiResponse("Objeto Excluído!"));
				apiResponses.addApiResponse("400", createApiResponse("Erro na Requisição!"));
				apiResponses.addApiResponse("401", createApiResponse("Acesso Não Autorizado!"));
				apiResponses.addApiResponse("404", createApiResponse("Objeto Não Encontrado!"));
				apiResponses.addApiResponse("500", createApiResponse("Erro na Aplicação!"));

			}));
		};
	}

	/**
	 * Cria e retorna uma instância de ApiResponse com a descrição fornecida.
	 *
	 * @param message Descrição da resposta de API.
	 * @return Instância de ApiResponse configurada com a descrição fornecida.
	 */
	private ApiResponse createApiResponse(String message) {

		return new ApiResponse().description(message);
	}
}
