// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

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
import com.hubspot.sdk.models.crm.owners.CollectionResponsePublicOwnerForwardPaging
import com.hubspot.sdk.models.crm.owners.OwnerGetParams
import com.hubspot.sdk.models.crm.owners.OwnerListPage
import com.hubspot.sdk.models.crm.owners.OwnerListParams
import com.hubspot.sdk.models.crm.owners.PublicOwner
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OwnerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OwnerService {

    private val withRawResponse: OwnerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OwnerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OwnerService =
        OwnerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: OwnerListParams, requestOptions: RequestOptions): OwnerListPage =
        // get /crm/owners/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: OwnerGetParams, requestOptions: RequestOptions): PublicOwner =
        // get /crm/owners/2026-03/{ownerId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OwnerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OwnerService.WithRawResponse =
            OwnerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicOwnerForwardPaging> =
            jsonHandler<CollectionResponsePublicOwnerForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: OwnerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OwnerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "owners", "2026-03")
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
                        OwnerListPage.builder()
                            .service(OwnerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<PublicOwner> =
            jsonHandler<PublicOwner>(clientOptions.jsonMapper)

        override fun get(
            params: OwnerGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ownerId", params.ownerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "owners", "2026-03", params._pathParam(0))
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
