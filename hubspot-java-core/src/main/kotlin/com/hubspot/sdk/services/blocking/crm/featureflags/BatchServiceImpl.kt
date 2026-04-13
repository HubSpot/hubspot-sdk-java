// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.featureflags

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot.sdk.models.crm.featureflags.batch.BatchDeleteParams
import com.hubspot.sdk.models.crm.featureflags.batch.BatchUpsertParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions,
    ): PortalFlagStateBatchResponse =
        // post /feature-flags/2026-03/{appId}/flags/{flagName}/portals/batch/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions,
    ): PortalFlagStateBatchResponse =
        // post /feature-flags/2026-03/{appId}/flags/{flagName}/portals/batch/upsert
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<PortalFlagStateBatchResponse> =
            jsonHandler<PortalFlagStateBatchResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalFlagStateBatchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
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
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertHandler: Handler<PortalFlagStateBatchResponse> =
            jsonHandler<PortalFlagStateBatchResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalFlagStateBatchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
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
                    .use { upsertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
