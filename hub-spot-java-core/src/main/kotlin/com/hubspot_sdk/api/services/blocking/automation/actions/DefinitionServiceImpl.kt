// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.automation.actions.CollectionResponsePublicActionDefinitionForwardPaging
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinition
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionListPage
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionReadParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DefinitionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DefinitionService {

    private val withRawResponse: DefinitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DefinitionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService =
        DefinitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions,
    ): PublicActionDefinition =
        // post /automation/v4/actions/{appId}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions,
    ): PublicActionDefinition =
        // patch /automation/v4/actions/{appId}/{definitionId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions,
    ): DefinitionListPage =
        // get /automation/v4/actions/{appId}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DefinitionDeleteParams, requestOptions: RequestOptions) {
        // delete /automation/v4/actions/{appId}/{definitionId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun read(
        params: DefinitionReadParams,
        requestOptions: RequestOptions,
    ): PublicActionDefinition =
        // get /automation/v4/actions/{appId}/{definitionId}
        withRawResponse().read(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefinitionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse =
            DefinitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicActionDefinition> =
            jsonHandler<PublicActionDefinition>(clientOptions.jsonMapper)

        override fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "actions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<PublicActionDefinition> =
            jsonHandler<PublicActionDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponsePublicActionDefinitionForwardPaging> =
            jsonHandler<CollectionResponsePublicActionDefinitionForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefinitionListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "actions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DefinitionListPage.builder()
                            .service(DefinitionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val readHandler: Handler<PublicActionDefinition> =
            jsonHandler<PublicActionDefinition>(clientOptions.jsonMapper)

        override fun read(
            params: DefinitionReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
