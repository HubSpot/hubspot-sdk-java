// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookBatchUpdateSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookListSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionListResponse
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AppWebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AppWebhookServiceAsync {

    private val withRawResponse: AppWebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppWebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppWebhookServiceAsync =
        AppWebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchUpdateSubscriptions(
        params: AppWebhookBatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        // post /app-webhooks/2026-03/{appId}/subscriptions/batch/update
        withRawResponse().batchUpdateSubscriptions(params, requestOptions).thenApply { it.parse() }

    override fun createSubscription(
        params: AppWebhookCreateSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // post /app-webhooks/2026-03/{appId}/subscriptions
        withRawResponse().createSubscription(params, requestOptions).thenApply { it.parse() }

    override fun deleteSettings(
        params: AppWebhookDeleteSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /app-webhooks/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions).thenAccept {}

    override fun deleteSubscription(
        params: AppWebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().deleteSubscription(params, requestOptions).thenAccept {}

    override fun getSettings(
        params: AppWebhookGetSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // get /app-webhooks/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).thenApply { it.parse() }

    override fun getSubscription(
        params: AppWebhookGetSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // get /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().getSubscription(params, requestOptions).thenApply { it.parse() }

    override fun listSubscriptions(
        params: AppWebhookListSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        // get /app-webhooks/2026-03/{appId}/subscriptions
        withRawResponse().listSubscriptions(params, requestOptions).thenApply { it.parse() }

    override fun updateSettings(
        params: AppWebhookUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // put /app-webhooks/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).thenApply { it.parse() }

    override fun updateSubscription(
        params: AppWebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // patch /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().updateSubscription(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppWebhookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppWebhookServiceAsync.WithRawResponse =
            AppWebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchUpdateSubscriptionsHandler: Handler<BatchResponseSubscriptionResponse> =
            jsonHandler<BatchResponseSubscriptionResponse>(clientOptions.jsonMapper)

        override fun batchUpdateSubscriptions(
            params: AppWebhookBatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "app-webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                        "batch",
                        "update",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchUpdateSubscriptionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun createSubscription(
            params: AppWebhookCreateSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "app-webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteSettings(
            params: AppWebhookDeleteSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("app-webhooks", "2026-03", params._pathParam(0), "settings")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteSettingsHandler.handle(it) }
                    }
                }
        }

        private val deleteSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteSubscription(
            params: AppWebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "app-webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteSubscriptionHandler.handle(it) }
                    }
                }
        }

        private val getSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun getSettings(
            params: AppWebhookGetSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("app-webhooks", "2026-03", params._pathParam(0), "settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun getSubscription(
            params: AppWebhookGetSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "app-webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listSubscriptionsHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun listSubscriptions(
            params: AppWebhookListSubscriptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "app-webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSubscriptionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun updateSettings(
            params: AppWebhookUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("app-webhooks", "2026-03", params._pathParam(0), "settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun updateSubscription(
            params: AppWebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "app-webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
