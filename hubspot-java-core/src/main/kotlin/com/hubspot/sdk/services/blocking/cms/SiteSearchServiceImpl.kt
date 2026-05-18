// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.cms.sitesearch.IndexedData
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteSearchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SiteSearchService {

    private val withRawResponse: SiteSearchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SiteSearchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteSearchService =
        SiteSearchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getIndexedData(
        params: SiteSearchGetIndexedDataParams,
        requestOptions: RequestOptions,
    ): IndexedData =
        // get /cms/site-search/2026-03/indexed-data/{contentId}
        withRawResponse().getIndexedData(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiteSearchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteSearchService.WithRawResponse =
            SiteSearchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getIndexedDataHandler: Handler<IndexedData> =
            jsonHandler<IndexedData>(clientOptions.jsonMapper)

        override fun getIndexedData(
            params: SiteSearchGetIndexedDataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexedData> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
