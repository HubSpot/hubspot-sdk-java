// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.meta.origins

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.handlers.stringHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.meta.origins.CollectionResponseIpRangeNoPaging
import com.hubspot.sdk.models.meta.origins.ipranges.IpRangeListParams
import com.hubspot.sdk.models.meta.origins.ipranges.IpRangeListSimpleParams
import java.util.function.Consumer

class IpRangeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IpRangeService {

    private val withRawResponse: IpRangeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IpRangeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeService =
        IpRangeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: IpRangeListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseIpRangeNoPaging =
        // get /meta/network-origins/2026-03/ip-ranges
        withRawResponse().list(params, requestOptions).parse()

    override fun listSimple(
        params: IpRangeListSimpleParams,
        requestOptions: RequestOptions,
    ): String =
        // get /meta/network-origins/2026-03/ip-ranges/simple
        withRawResponse().listSimple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpRangeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpRangeService.WithRawResponse =
            IpRangeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseIpRangeNoPaging> =
            jsonHandler<CollectionResponseIpRangeNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: IpRangeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseIpRangeNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meta", "network-origins", "2026-03", "ip-ranges")
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

        private val listSimpleHandler: Handler<String> = stringHandler()

        override fun listSimple(
            params: IpRangeListSimpleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meta", "network-origins", "2026-03", "ip-ranges", "simple")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listSimpleHandler.handle(it) }
            }
        }
    }
}
