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
import com.hubspot_sdk.api.models.cms.domains.CollectionResponseWithTotalDomainForwardPaging
import com.hubspot_sdk.api.models.cms.domains.Domain
import com.hubspot_sdk.api.models.cms.domains.DomainGetParams
import com.hubspot_sdk.api.models.cms.domains.DomainListPage
import com.hubspot_sdk.api.models.cms.domains.DomainListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DomainServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DomainService {

    private val withRawResponse: DomainService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DomainService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DomainService =
        DomainServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: DomainListParams, requestOptions: RequestOptions): DomainListPage =
        // get /cms/v3/domains/
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: DomainGetParams, requestOptions: RequestOptions): Domain =
        // get /cms/v3/domains/{domainId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DomainService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DomainService.WithRawResponse =
            DomainServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalDomainForwardPaging> =
            jsonHandler<CollectionResponseWithTotalDomainForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: DomainListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DomainListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "domains", "")
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
                        DomainListPage.builder()
                            .service(DomainServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<Domain> = jsonHandler<Domain>(clientOptions.jsonMapper)

        override fun get(
            params: DomainGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Domain> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "domains", params._pathParam(0))
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
