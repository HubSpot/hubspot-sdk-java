// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
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
import com.hubspot.sdk.models.cms.urlredirects.CollectionResponseWithTotalUrlMappingForwardPaging
import com.hubspot.sdk.models.cms.urlredirects.UrlMapping
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectCreateParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectDeleteParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectGetParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectListPage
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectListParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UrlRedirectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UrlRedirectService {

    private val withRawResponse: UrlRedirectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UrlRedirectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlRedirectService =
        UrlRedirectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UrlRedirectCreateParams,
        requestOptions: RequestOptions,
    ): UrlMapping =
        // post /cms/url-redirects/2026-03
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: UrlRedirectUpdateParams,
        requestOptions: RequestOptions,
    ): UrlMapping =
        // patch /cms/url-redirects/2026-03/{urlRedirectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: UrlRedirectListParams,
        requestOptions: RequestOptions,
    ): UrlRedirectListPage =
        // get /cms/url-redirects/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: UrlRedirectDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/url-redirects/2026-03/{urlRedirectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: UrlRedirectGetParams, requestOptions: RequestOptions): UrlMapping =
        // get /cms/url-redirects/2026-03/{urlRedirectId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UrlRedirectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlRedirectService.WithRawResponse =
            UrlRedirectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UrlMapping> =
            jsonHandler<UrlMapping>(clientOptions.jsonMapper)

        override fun create(
            params: UrlRedirectCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UrlMapping> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "url-redirects", "2026-03")
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

        private val updateHandler: Handler<UrlMapping> =
            jsonHandler<UrlMapping>(clientOptions.jsonMapper)

        override fun update(
            params: UrlRedirectUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UrlMapping> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlRedirectId", params.urlRedirectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "url-redirects", "2026-03", params._pathParam(0))
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

        private val listHandler: Handler<CollectionResponseWithTotalUrlMappingForwardPaging> =
            jsonHandler<CollectionResponseWithTotalUrlMappingForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: UrlRedirectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UrlRedirectListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "url-redirects", "2026-03")
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
                        UrlRedirectListPage.builder()
                            .service(UrlRedirectServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UrlRedirectDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlRedirectId", params.urlRedirectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "url-redirects", "2026-03", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<UrlMapping> =
            jsonHandler<UrlMapping>(clientOptions.jsonMapper)

        override fun get(
            params: UrlRedirectGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UrlMapping> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlRedirectId", params.urlRedirectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "url-redirects", "2026-03", params._pathParam(0))
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
