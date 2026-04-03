// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

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
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CrmObjectSnapshotBatchResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.FilterCreateResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.FilterResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SettingsResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SnapshotStatusResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionListResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionResponse1
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateCrmSnapshotParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateJournalSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteJournalSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeletePortalSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionListJournalSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionListSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionUpdateSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionUpdateSubscriptionParams
import com.hubspot_sdk.api.services.async.webhooks.webhooksubscriptions.BatchServiceAsync
import com.hubspot_sdk.api.services.async.webhooks.webhooksubscriptions.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhookSubscriptionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WebhookSubscriptionServiceAsync {

    private val withRawResponse: WebhookSubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WebhookSubscriptionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WebhookSubscriptionServiceAsync =
        WebhookSubscriptionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun batch(): BatchServiceAsync = batch

    override fun createCrmSnapshot(
        params: WebhookSubscriptionCreateCrmSnapshotParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        // post /webhooks-journal/snapshots/2026-03/crm
        withRawResponse().createCrmSnapshot(params, requestOptions).thenApply { it.parse() }

    override fun createJournalSubscription(
        params: WebhookSubscriptionCreateJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse1> =
        // post /webhooks-journal/subscriptions/2026-03
        withRawResponse().createJournalSubscription(params, requestOptions).thenApply { it.parse() }

    override fun createSubscription(
        params: WebhookSubscriptionCreateSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // post /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().createSubscription(params, requestOptions).thenApply { it.parse() }

    override fun createSubscriptionFilter(
        params: WebhookSubscriptionCreateSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterCreateResponse> =
        // post /webhooks-journal/subscriptions/2026-03/filters
        withRawResponse().createSubscriptionFilter(params, requestOptions).thenApply { it.parse() }

    override fun deleteJournalSubscription(
        params: WebhookSubscriptionDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/{subscriptionId}
        withRawResponse().deleteJournalSubscription(params, requestOptions).thenAccept {}

    override fun deletePortalSubscriptions(
        params: WebhookSubscriptionDeletePortalSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/portals/{portalId}
        withRawResponse().deletePortalSubscriptions(params, requestOptions).thenAccept {}

    override fun deleteSettings(
        params: WebhookSubscriptionDeleteSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions).thenAccept {}

    override fun deleteSubscription(
        params: WebhookSubscriptionDeleteSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().deleteSubscription(params, requestOptions).thenAccept {}

    override fun deleteSubscriptionFilter(
        params: WebhookSubscriptionDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().deleteSubscriptionFilter(params, requestOptions).thenAccept {}

    override fun getJournalEarliest(
        params: WebhookSubscriptionGetJournalEarliestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal/2026-03/earliest
        withRawResponse().getJournalEarliest(params, requestOptions)

    override fun getJournalLatest(
        params: WebhookSubscriptionGetJournalLatestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal/2026-03/latest
        withRawResponse().getJournalLatest(params, requestOptions)

    override fun getJournalNextByOffset(
        params: WebhookSubscriptionGetJournalNextByOffsetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal/2026-03/offset/{offset}/next
        withRawResponse().getJournalNextByOffset(params, requestOptions)

    override fun getJournalStatus(
        params: WebhookSubscriptionGetJournalStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        // get /webhooks-journal/journal/2026-03/status/{statusId}
        withRawResponse().getJournalStatus(params, requestOptions).thenApply { it.parse() }

    override fun getLocalJournalEarliest(
        params: WebhookSubscriptionGetLocalJournalEarliestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal-local/2026-03/earliest
        withRawResponse().getLocalJournalEarliest(params, requestOptions)

    override fun getLocalJournalLatest(
        params: WebhookSubscriptionGetLocalJournalLatestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal-local/2026-03/latest
        withRawResponse().getLocalJournalLatest(params, requestOptions)

    override fun getLocalJournalNextByOffset(
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal-local/2026-03/offset/{offset}/next
        withRawResponse().getLocalJournalNextByOffset(params, requestOptions)

    override fun getLocalJournalStatus(
        params: WebhookSubscriptionGetLocalJournalStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        // get /webhooks-journal/journal-local/2026-03/status/{statusId}
        withRawResponse().getLocalJournalStatus(params, requestOptions).thenApply { it.parse() }

    override fun getSettings(
        params: WebhookSubscriptionGetSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // get /webhooks/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).thenApply { it.parse() }

    override fun getSubscription(
        params: WebhookSubscriptionGetSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // get /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().getSubscription(params, requestOptions).thenApply { it.parse() }

    override fun getSubscriptionFilter(
        params: WebhookSubscriptionGetSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterResponse> =
        // get /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().getSubscriptionFilter(params, requestOptions).thenApply { it.parse() }

    override fun getSubscriptionFilterForSubscription(
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        // get /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}
        withRawResponse().getSubscriptionFilterForSubscription(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listJournalSubscriptions(
        params: WebhookSubscriptionListJournalSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        // get /webhooks-journal/subscriptions/2026-03
        withRawResponse().listJournalSubscriptions(params, requestOptions).thenApply { it.parse() }

    override fun listSubscriptions(
        params: WebhookSubscriptionListSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        // get /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().listSubscriptions(params, requestOptions).thenApply { it.parse() }

    override fun updateSettings(
        params: WebhookSubscriptionUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // put /webhooks/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).thenApply { it.parse() }

    override fun updateSubscription(
        params: WebhookSubscriptionUpdateSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // patch /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().updateSubscription(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookSubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookSubscriptionServiceAsync.WithRawResponse =
            WebhookSubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createCrmSnapshotHandler: Handler<CrmObjectSnapshotBatchResponse> =
            jsonHandler<CrmObjectSnapshotBatchResponse>(clientOptions.jsonMapper)

        override fun createCrmSnapshot(
            params: WebhookSubscriptionCreateCrmSnapshotParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "snapshots", "2026-03", "crm")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createCrmSnapshotHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createJournalSubscriptionHandler: Handler<SubscriptionResponse1> =
            jsonHandler<SubscriptionResponse1>(clientOptions.jsonMapper)

        override fun createJournalSubscription(
            params: WebhookSubscriptionCreateJournalSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createJournalSubscriptionHandler.handle(it) }
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
            params: WebhookSubscriptionCreateSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "subscriptions")
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

        private val createSubscriptionFilterHandler: Handler<FilterCreateResponse> =
            jsonHandler<FilterCreateResponse>(clientOptions.jsonMapper)

        override fun createSubscriptionFilter(
            params: WebhookSubscriptionCreateSubscriptionFilterParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03", "filters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createSubscriptionFilterHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteJournalSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteJournalSubscription(
            params: WebhookSubscriptionDeleteJournalSubscriptionParams,
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
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteJournalSubscriptionHandler.handle(it) }
                    }
                }
        }

        private val deletePortalSubscriptionsHandler: Handler<Void?> = emptyHandler()

        override fun deletePortalSubscriptions(
            params: WebhookSubscriptionDeletePortalSubscriptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "portals",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deletePortalSubscriptionsHandler.handle(it) }
                    }
                }
        }

        private val deleteSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteSettings(
            params: WebhookSubscriptionDeleteSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "settings")
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
            params: WebhookSubscriptionDeleteSubscriptionParams,
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
                        "webhooks",
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

        private val deleteSubscriptionFilterHandler: Handler<Void?> = emptyHandler()

        override fun deleteSubscriptionFilter(
            params: WebhookSubscriptionDeleteSubscriptionFilterParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("filterId", params.filterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "filters",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteSubscriptionFilterHandler.handle(it) }
                    }
                }
        }

        override fun getJournalEarliest(
            params: WebhookSubscriptionGetJournalEarliestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "earliest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun getJournalLatest(
            params: WebhookSubscriptionGetJournalLatestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "latest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun getJournalNextByOffset(
            params: WebhookSubscriptionGetJournalNextByOffsetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offset", params.offset().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "offset",
                        params._pathParam(0),
                        "next",
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val getJournalStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getJournalStatus(
            params: WebhookSubscriptionGetJournalStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("statusId", params.statusId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "status",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getJournalStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun getLocalJournalEarliest(
            params: WebhookSubscriptionGetLocalJournalEarliestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal-local", "2026-03", "earliest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun getLocalJournalLatest(
            params: WebhookSubscriptionGetLocalJournalLatestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal-local", "2026-03", "latest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun getLocalJournalNextByOffset(
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offset", params.offset().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "offset",
                        params._pathParam(0),
                        "next",
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val getLocalJournalStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalStatus(
            params: WebhookSubscriptionGetLocalJournalStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("statusId", params.statusId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "status",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocalJournalStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun getSettings(
            params: WebhookSubscriptionGetSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "settings")
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
            params: WebhookSubscriptionGetSubscriptionParams,
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
                        "webhooks",
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

        private val getSubscriptionFilterHandler: Handler<FilterResponse> =
            jsonHandler<FilterResponse>(clientOptions.jsonMapper)

        override fun getSubscriptionFilter(
            params: WebhookSubscriptionGetSubscriptionFilterParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("filterId", params.filterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "filters",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSubscriptionFilterHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSubscriptionFilterForSubscriptionHandler: Handler<List<FilterResponse>> =
            jsonHandler<List<FilterResponse>>(clientOptions.jsonMapper)

        override fun getSubscriptionFilterForSubscription(
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "filters",
                        "subscription",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSubscriptionFilterForSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val listJournalSubscriptionsHandler:
            Handler<CollectionResponseSubscriptionResponseNoPaging> =
            jsonHandler<CollectionResponseSubscriptionResponseNoPaging>(clientOptions.jsonMapper)

        override fun listJournalSubscriptions(
            params: WebhookSubscriptionListJournalSubscriptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listJournalSubscriptionsHandler.handle(it) }
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
            params: WebhookSubscriptionListSubscriptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "subscriptions")
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
            params: WebhookSubscriptionUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "settings")
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
            params: WebhookSubscriptionUpdateSubscriptionParams,
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
                        "webhooks",
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
