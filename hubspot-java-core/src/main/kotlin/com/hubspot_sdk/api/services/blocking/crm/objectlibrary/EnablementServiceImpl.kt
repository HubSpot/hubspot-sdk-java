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
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetAllParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetByObjectTypeIdParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.ObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.PortalObjectTypeEnablementPublicResponse
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

    override fun getAll(
        params: EnablementGetAllParams,
        requestOptions: RequestOptions,
    ): PortalObjectTypeEnablementPublicResponse =
        // get /crm/object-library/2026-03/enablement
        withRawResponse().getAll(params, requestOptions).parse()

    override fun getByObjectTypeId(
        params: EnablementGetByObjectTypeIdParams,
        requestOptions: RequestOptions,
    ): ObjectTypeEnablementPublicResponse =
        // get /crm/object-library/2026-03/enablement/{objectTypeId}
        withRawResponse().getByObjectTypeId(params, requestOptions).parse()

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

        private val getAllHandler: Handler<PortalObjectTypeEnablementPublicResponse> =
            jsonHandler<PortalObjectTypeEnablementPublicResponse>(clientOptions.jsonMapper)

        override fun getAll(
            params: EnablementGetAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "object-library", "2026-03", "enablement")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByObjectTypeIdHandler: Handler<ObjectTypeEnablementPublicResponse> =
            jsonHandler<ObjectTypeEnablementPublicResponse>(clientOptions.jsonMapper)

        override fun getByObjectTypeId(
            params: EnablementGetByObjectTypeIdParams,
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
                        "object-library",
                        "2026-03",
                        "enablement",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByObjectTypeIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
