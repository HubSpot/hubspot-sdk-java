// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

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
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.associations.v4.V4MergeParams
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V4ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V4Service {

    private val withRawResponse: V4Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val report: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): V4Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service =
        V4ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun report(): ReportService = report

    override fun merge(params: V4MergeParams, requestOptions: RequestOptions): SimplePublicObject =
        // post /crm/v4/objects/{objectType}/merge
        withRawResponse().merge(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4Service.WithRawResponse =
            V4ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun report(): ReportService.WithRawResponse = report

        private val mergeHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun merge(
            params: V4MergeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v4", "objects", params._pathParam(0), "merge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { mergeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
