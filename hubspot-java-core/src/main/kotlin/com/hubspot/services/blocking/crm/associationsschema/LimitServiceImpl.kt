// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.associationsschema

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot.models.crm.associationsschema.CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
import com.hubspot.models.crm.associationsschema.limits.LimitBatchDeleteParams
import com.hubspot.models.crm.associationsschema.limits.LimitBatchUpdateParams
import com.hubspot.models.crm.associationsschema.limits.LimitGetByObjectTypesParams
import com.hubspot.models.crm.associationsschema.limits.LimitListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LimitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LimitService {

    private val withRawResponse: LimitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LimitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitService =
        LimitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: LimitListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        // get /crm/associations/2026-03/definitions/configurations/all
        withRawResponse().list(params, requestOptions).parse()

    override fun batchDelete(params: LimitBatchDeleteParams, requestOptions: RequestOptions) {
        // post
        // /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge
        withRawResponse().batchDelete(params, requestOptions)
    }

    override fun batchUpdate(
        params: LimitBatchUpdateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        // post
        // /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update
        withRawResponse().batchUpdate(params, requestOptions).parse()

    override fun getByObjectTypes(
        params: LimitGetByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        // get /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}
        withRawResponse().getByObjectTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimitService.WithRawResponse =
            LimitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: LimitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "definitions",
                        "configurations",
                        "all",
                    )
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
            }
        }

        private val batchDeleteHandler: Handler<Void?> = emptyHandler()

        override fun batchDelete(
            params: LimitBatchDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "purge",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { batchDeleteHandler.handle(it) }
            }
        }

        private val batchUpdateHandler:
            Handler<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            jsonHandler<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>(
                clientOptions.jsonMapper
            )

        override fun batchUpdate(
            params: LimitBatchUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "update",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchUpdateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByObjectTypesHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getByObjectTypes(
            params: LimitGetByObjectTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByObjectTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
