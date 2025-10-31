// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataResponse
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchResponse
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
    ): SiteSearchGetIndexedDataResponse =
        // get /cms/v3/site-search/indexed-data/{contentId}
        withRawResponse().getIndexedData(params, requestOptions).parse()

    override fun search(
        params: SiteSearchSearchParams,
        requestOptions: RequestOptions,
    ): SiteSearchSearchResponse =
        // get /cms/v3/site-search/search
        withRawResponse().search(params, requestOptions).parse()

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

        private val getIndexedDataHandler: Handler<SiteSearchGetIndexedDataResponse> =
            jsonHandler<SiteSearchGetIndexedDataResponse>(clientOptions.jsonMapper)

        override fun getIndexedData(
            params: SiteSearchGetIndexedDataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteSearchGetIndexedDataResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contentId", params.contentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "site-search",
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

        private val searchHandler: Handler<SiteSearchSearchResponse> =
            jsonHandler<SiteSearchSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: SiteSearchSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteSearchSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "site-search", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
