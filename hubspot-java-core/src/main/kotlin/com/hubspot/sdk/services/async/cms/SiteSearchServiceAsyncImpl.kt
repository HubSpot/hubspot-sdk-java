// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

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
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.cms.sitesearch.IndexedData
import com.hubspot.sdk.models.cms.sitesearch.PublicSearchResults
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchSearchParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteSearchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SiteSearchServiceAsync {

    private val withRawResponse: SiteSearchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SiteSearchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteSearchServiceAsync =
        SiteSearchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getIndexedData(
        params: SiteSearchGetIndexedDataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexedData> =
        // get /cms/site-search/2026-03/indexed-data/{contentId}
        withRawResponse().getIndexedData(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: SiteSearchSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSearchResults> =
        // get /cms/site-search/2026-03/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiteSearchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteSearchServiceAsync.WithRawResponse =
            SiteSearchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getIndexedDataHandler: Handler<IndexedData> =
            jsonHandler<IndexedData>(clientOptions.jsonMapper)

        override fun getIndexedData(
            params: SiteSearchGetIndexedDataParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexedData>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contentId", params.contentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "site-search",
                        "2026-03",
                        "indexed-data",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getIndexedDataHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<PublicSearchResults> =
            jsonHandler<PublicSearchResults>(clientOptions.jsonMapper)

        override fun search(
            params: SiteSearchSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSearchResults>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "site-search", "2026-03", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
