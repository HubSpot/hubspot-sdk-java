// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

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
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeletePortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetPortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListAllParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdatePortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FlagResponse
import com.hubspot_sdk.api.models.crm.featureflags.FlagsForAppResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateResponse
import com.hubspot_sdk.api.services.blocking.crm.featureflags.BatchService
import com.hubspot_sdk.api.services.blocking.crm.featureflags.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeatureFlagServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureFlagService {

    private val withRawResponse: FeatureFlagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): FeatureFlagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagService =
        FeatureFlagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun update(
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions,
    ): FlagResponse =
        // put /feature-flags/2026-03/{appId}/flags/{flagName}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions,
    ): FlagResponse =
        // delete /feature-flags/2026-03/{appId}/flags/{flagName}
        withRawResponse().delete(params, requestOptions).parse()

    override fun deletePortalState(
        params: FeatureFlagDeletePortalStateParams,
        requestOptions: RequestOptions,
    ): PortalFlagStateResponse =
        // delete /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().deletePortalState(params, requestOptions).parse()

    override fun get(params: FeatureFlagGetParams, requestOptions: RequestOptions): FlagResponse =
        // get /feature-flags/2026-03/{appId}/flags/{flagName}
        withRawResponse().get(params, requestOptions).parse()

    override fun getPortalState(
        params: FeatureFlagGetPortalStateParams,
        requestOptions: RequestOptions,
    ): PortalFlagStateResponse =
        // get /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().getPortalState(params, requestOptions).parse()

    override fun listAll(
        params: FeatureFlagListAllParams,
        requestOptions: RequestOptions,
    ): FlagsForAppResponse =
        // get /feature-flags/2026-03/{appId}/flags/all
        withRawResponse().listAll(params, requestOptions).parse()

    override fun listPortals(
        params: FeatureFlagListPortalsParams,
        requestOptions: RequestOptions,
    ): PortalFlagStateBatchResponse =
        // get /feature-flags/2026-03/{appId}/flags/{flagName}/portals
        withRawResponse().listPortals(params, requestOptions).parse()

    override fun updatePortalState(
        params: FeatureFlagUpdatePortalStateParams,
        requestOptions: RequestOptions,
    ): PortalFlagStateResponse =
        // put /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().updatePortalState(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureFlagService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureFlagService.WithRawResponse =
            FeatureFlagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val updateHandler: Handler<FlagResponse> =
            jsonHandler<FlagResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlagResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
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

        private val deleteHandler: Handler<FlagResponse> =
            jsonHandler<FlagResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlagResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
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

        private val deletePortalStateHandler: Handler<PortalFlagStateResponse> =
            jsonHandler<PortalFlagStateResponse>(clientOptions.jsonMapper)

        override fun deletePortalState(
            params: FeatureFlagDeletePortalStateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalFlagStateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
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
                    .use { deletePortalStateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<FlagResponse> =
            jsonHandler<FlagResponse>(clientOptions.jsonMapper)

        override fun get(
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlagResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
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

        private val getPortalStateHandler: Handler<PortalFlagStateResponse> =
            jsonHandler<PortalFlagStateResponse>(clientOptions.jsonMapper)

        override fun getPortalState(
            params: FeatureFlagGetPortalStateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalFlagStateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
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
                    .use { getPortalStateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAllHandler: Handler<FlagsForAppResponse> =
            jsonHandler<FlagsForAppResponse>(clientOptions.jsonMapper)

        override fun listAll(
            params: FeatureFlagListAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlagsForAppResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        "all",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPortalsHandler: Handler<PortalFlagStateBatchResponse> =
            jsonHandler<PortalFlagStateBatchResponse>(clientOptions.jsonMapper)

        override fun listPortals(
            params: FeatureFlagListPortalsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalFlagStateBatchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPortalsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updatePortalStateHandler: Handler<PortalFlagStateResponse> =
            jsonHandler<PortalFlagStateResponse>(clientOptions.jsonMapper)

        override fun updatePortalState(
            params: FeatureFlagUpdatePortalStateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalFlagStateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
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
                    .use { updatePortalStateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
