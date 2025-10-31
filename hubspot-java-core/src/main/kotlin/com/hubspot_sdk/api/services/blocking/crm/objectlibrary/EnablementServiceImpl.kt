// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectlibrary

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
import com.hubspot_sdk.api.models.crm.objectlibrary.ObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.PortalObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EnablementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EnablementService {

    private val withRawResponse: EnablementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnablementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnablementService =
        EnablementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EnablementListParams,
        requestOptions: RequestOptions,
    ): PortalObjectTypeEnablementPublicResponse =
        // get /crm/v3/object-library/enablement
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: EnablementGetParams,
        requestOptions: RequestOptions,
    ): ObjectTypeEnablementPublicResponse =
        // get /crm/v3/object-library/enablement/{objectTypeId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnablementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnablementService.WithRawResponse =
            EnablementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PortalObjectTypeEnablementPublicResponse> =
            jsonHandler<PortalObjectTypeEnablementPublicResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EnablementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "object-library", "enablement")
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

        private val getHandler: Handler<ObjectTypeEnablementPublicResponse> =
            jsonHandler<ObjectTypeEnablementPublicResponse>(clientOptions.jsonMapper)

        override fun get(
            params: EnablementGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectTypeId", params.objectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "object-library",
                        "enablement",
                        params._pathParam(0),
                    )
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
