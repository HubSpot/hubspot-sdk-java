// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
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
import com.hubspot.sdk.models.cms.pages.BatchResponsePage
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchCreateLandingPagesParams
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchDeleteLandingPagesParams
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchGetLandingPagesParams
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchUpdateLandingPagesParams
import java.util.function.Consumer

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createLandingPages(
        params: BatchCreateLandingPagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/landing-pages/batch/create
        withRawResponse().createLandingPages(params, requestOptions).parse()

    override fun deleteLandingPages(
        params: BatchDeleteLandingPagesParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/landing-pages/batch/archive
        withRawResponse().deleteLandingPages(params, requestOptions)
    }

    override fun getLandingPages(
        params: BatchGetLandingPagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/landing-pages/batch/read
        withRawResponse().getLandingPages(params, requestOptions).parse()

    override fun updateLandingPages(
        params: BatchUpdateLandingPagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/landing-pages/batch/update
        withRawResponse().updateLandingPages(params, requestOptions).parse()

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

        private val createLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun createLandingPages(
            params: BatchCreateLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteLandingPagesHandler: Handler<Void?> = emptyHandler()

        override fun deleteLandingPages(
            params: BatchDeleteLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteLandingPagesHandler.handle(it) }
            }
        }

        private val getLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun getLandingPages(
            params: BatchGetLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun updateLandingPages(
            params: BatchUpdateLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
