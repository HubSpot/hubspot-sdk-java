// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

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
import com.hubspot.core.prepareAsync
import com.hubspot.models.crm.appuninstalls.AppUninstallUninstallParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AppUninstallServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AppUninstallServiceAsync {

    private val withRawResponse: AppUninstallServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppUninstallServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppUninstallServiceAsync =
        AppUninstallServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun uninstall(
        params: AppUninstallUninstallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /appinstalls/2026-03/external-install
        withRawResponse().uninstall(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppUninstallServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppUninstallServiceAsync.WithRawResponse =
            AppUninstallServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val uninstallHandler: Handler<Void?> = emptyHandler()

        override fun uninstall(
            params: AppUninstallUninstallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("appinstalls", "2026-03", "external-install")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { uninstallHandler.handle(it) }
                    }
                }
        }
    }
}
