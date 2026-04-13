// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.cms.urlmappings.UrlMappingCreateParams
import com.hubspot.models.cms.urlmappings.UrlMappingDeleteParams
import com.hubspot.models.cms.urlmappings.UrlMappingGetParams
import com.hubspot.models.cms.urlmappings.UrlMappingListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UrlMappingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UrlMappingService {

    private val withRawResponse: UrlMappingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UrlMappingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlMappingService =
        UrlMappingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UrlMappingCreateParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /url-mappings/2026-03/url-mappings
        withRawResponse().create(params, requestOptions)

    override fun list(params: UrlMappingListParams, requestOptions: RequestOptions): HttpResponse =
        // get /url-mappings/2026-03/url-mappings
        withRawResponse().list(params, requestOptions)

    override fun delete(params: UrlMappingDeleteParams, requestOptions: RequestOptions) {
        // delete /url-mappings/2026-03/url-mappings/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: UrlMappingGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /url-mappings/2026-03/url-mappings/{id}
        withRawResponse().get(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UrlMappingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlMappingService.WithRawResponse =
            UrlMappingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun create(
            params: UrlMappingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("url-mappings", "2026-03", "url-mappings")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun list(
            params: UrlMappingListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("url-mappings", "2026-03", "url-mappings")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UrlMappingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "url-mappings",
                        "2026-03",
                        "url-mappings",
                        params._pathParam(0),
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

        override fun get(
            params: UrlMappingGetParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "url-mappings",
                        "2026-03",
                        "url-mappings",
                        params._pathParam(0),
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
