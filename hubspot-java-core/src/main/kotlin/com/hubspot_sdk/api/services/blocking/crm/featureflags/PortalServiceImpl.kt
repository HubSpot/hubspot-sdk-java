// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PortalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PortalService {

    private val withRawResponse: PortalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortalService =
        PortalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: PortalUpdateParams,
        requestOptions: RequestOptions,
    ): PortalUpdateResponse =
        // put /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: PortalDeleteParams,
        requestOptions: RequestOptions,
    ): PortalDeleteResponse =
        // delete /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().delete(params, requestOptions).parse()

    override fun batchDelete(
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions,
    ): PortalBatchDeleteResponse =
        // post /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/delete
        withRawResponse().batchDelete(params, requestOptions).parse()

    override fun batchUpsert(
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions,
    ): PortalBatchUpsertResponse =
        // post /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/upsert
        withRawResponse().batchUpsert(params, requestOptions).parse()

    override fun get(params: PortalGetParams, requestOptions: RequestOptions): PortalGetResponse =
        // get /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortalService.WithRawResponse =
            PortalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<PortalUpdateResponse> =
            jsonHandler<PortalUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PortalUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        params._pathParam(2),
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

        private val deleteHandler: Handler<PortalDeleteResponse> =
            jsonHandler<PortalDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PortalDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchDeleteHandler: Handler<PortalBatchDeleteResponse> =
            jsonHandler<PortalBatchDeleteResponse>(clientOptions.jsonMapper)

        override fun batchDelete(
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalBatchDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        "batch",
                        "delete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchDeleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchUpsertHandler: Handler<PortalBatchUpsertResponse> =
            jsonHandler<PortalBatchUpsertResponse>(clientOptions.jsonMapper)

        override fun batchUpsert(
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalBatchUpsertResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        "batch",
                        "upsert",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchUpsertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<PortalGetResponse> =
            jsonHandler<PortalGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PortalGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
