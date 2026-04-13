// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.crm.appuninstalls.AppUninstallUninstallParams
import java.util.function.Consumer

class AppUninstallServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AppUninstallService {

    private val withRawResponse: AppUninstallService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppUninstallService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppUninstallService =
        AppUninstallServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun uninstall(params: AppUninstallUninstallParams, requestOptions: RequestOptions) {
        // delete /appinstalls/2026-03/external-install
        withRawResponse().uninstall(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppUninstallService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppUninstallService.WithRawResponse =
            AppUninstallServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val uninstallHandler: Handler<Void?> = emptyHandler()

        override fun uninstall(
            params: AppUninstallUninstallParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("appinstalls", "2026-03", "external-install")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uninstallHandler.handle(it) }
            }
        }
    }
}
