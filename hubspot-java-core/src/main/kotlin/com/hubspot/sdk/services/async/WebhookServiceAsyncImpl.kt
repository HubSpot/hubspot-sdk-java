// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.webhooks.BatchResponseJournalFetchResponse
import com.hubspot.sdk.models.webhooks.BatchResponseSubscriptionResponse
import com.hubspot.sdk.models.webhooks.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot.sdk.models.webhooks.CrmObjectSnapshotBatchResponse
import com.hubspot.sdk.models.webhooks.FilterCreateResponse
import com.hubspot.sdk.models.webhooks.FilterResponse
import com.hubspot.sdk.models.webhooks.SettingsResponse
import com.hubspot.sdk.models.webhooks.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooks.SubscriptionListResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse1
import com.hubspot.sdk.models.webhooks.WebhookCreateBatchEventSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookCreateCrmSnapshotsParams
import com.hubspot.sdk.models.webhooks.WebhookCreateEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteJournalSubscriptionForPortalParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchByRequestParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchFromOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalStatusParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchByRequestParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchFromOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalStatusParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextJournalEntriesParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextLocalJournalEntriesParams
import com.hubspot.sdk.models.webhooks.WebhookGetSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookGetSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookListEventSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookListJournalSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookListSubscriptionFiltersParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSettingsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createBatchEventSubscriptions(
        params: WebhookCreateBatchEventSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        // post /webhooks/2026-03/{appId}/subscriptions/batch/update
        withRawResponse().createBatchEventSubscriptions(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createCrmSnapshots(
        params: WebhookCreateCrmSnapshotsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        // post /webhooks-journal/snapshots/2026-03/crm
        withRawResponse().createCrmSnapshots(params, requestOptions).thenApply { it.parse() }

    override fun createEventSubscription(
        params: WebhookCreateEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // post /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().createEventSubscription(params, requestOptions).thenApply { it.parse() }

    override fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse1> =
        // post /webhooks-journal/subscriptions/2026-03
        withRawResponse().createJournalSubscription(params, requestOptions).thenApply { it.parse() }

    override fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterCreateResponse> =
        // post /webhooks-journal/subscriptions/2026-03/filters
        withRawResponse().createSubscriptionFilter(params, requestOptions).thenApply { it.parse() }

    override fun deleteEventSubscription(
        params: WebhookDeleteEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().deleteEventSubscription(params, requestOptions).thenAccept {}

    override fun deleteJournalSubscription(
        params: WebhookDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/{subscriptionId}
        withRawResponse().deleteJournalSubscription(params, requestOptions).thenAccept {}

    override fun deleteJournalSubscriptionForPortal(
        params: WebhookDeleteJournalSubscriptionForPortalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/portals/{portalId}
        withRawResponse().deleteJournalSubscriptionForPortal(params, requestOptions).thenAccept {}

    override fun deleteSettings(
        params: WebhookDeleteSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions).thenAccept {}

    override fun deleteSubscriptionFilter(
        params: WebhookDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().deleteSubscriptionFilter(params, requestOptions).thenAccept {}

    override fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal/2026-03/batch/earliest/{count}
        withRawResponse().getEarliestJournalBatch(params, requestOptions).thenApply { it.parse() }

    override fun getEarliestJournalEntry(
        params: WebhookGetEarliestJournalEntryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal/2026-03/earliest
        withRawResponse().getEarliestJournalEntry(params, requestOptions)

    override fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal-local/2026-03/batch/earliest/{count}
        withRawResponse().getEarliestLocalJournalBatch(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getEarliestLocalJournalEntry(
        params: WebhookGetEarliestLocalJournalEntryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal-local/2026-03/earliest
        withRawResponse().getEarliestLocalJournalEntry(params, requestOptions)

    override fun getEventSubscription(
        params: WebhookGetEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // get /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().getEventSubscription(params, requestOptions).thenApply { it.parse() }

    override fun getJournalBatchByRequest(
        params: WebhookGetJournalBatchByRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // post /webhooks-journal/journal/2026-03/batch/read
        withRawResponse().getJournalBatchByRequest(params, requestOptions).thenApply { it.parse() }

    override fun getJournalBatchFromOffset(
        params: WebhookGetJournalBatchFromOffsetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}
        withRawResponse().getJournalBatchFromOffset(params, requestOptions).thenApply { it.parse() }

    override fun getJournalStatus(
        params: WebhookGetJournalStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        // get /webhooks-journal/journal/2026-03/status/{statusId}
        withRawResponse().getJournalStatus(params, requestOptions).thenApply { it.parse() }

    override fun getJournalSubscription(
        params: WebhookGetJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse1> =
        // get /webhooks-journal/subscriptions/2026-03/{subscriptionId}
        withRawResponse().getJournalSubscription(params, requestOptions).thenApply { it.parse() }

    override fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal/2026-03/batch/latest/{count}
        withRawResponse().getLatestJournalBatch(params, requestOptions).thenApply { it.parse() }

    override fun getLatestJournalEntry(
        params: WebhookGetLatestJournalEntryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal/2026-03/latest
        withRawResponse().getLatestJournalEntry(params, requestOptions)

    override fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal-local/2026-03/batch/latest/{count}
        withRawResponse().getLatestLocalJournalBatch(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getLatestLocalJournalEntry(
        params: WebhookGetLatestLocalJournalEntryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal-local/2026-03/latest
        withRawResponse().getLatestLocalJournalEntry(params, requestOptions)

    override fun getLocalJournalBatchByRequest(
        params: WebhookGetLocalJournalBatchByRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // post /webhooks-journal/journal-local/2026-03/batch/read
        withRawResponse().getLocalJournalBatchByRequest(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getLocalJournalBatchFromOffset(
        params: WebhookGetLocalJournalBatchFromOffsetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}
        withRawResponse().getLocalJournalBatchFromOffset(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getLocalJournalStatus(
        params: WebhookGetLocalJournalStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        // get /webhooks-journal/journal-local/2026-03/status/{statusId}
        withRawResponse().getLocalJournalStatus(params, requestOptions).thenApply { it.parse() }

    override fun getNextJournalEntries(
        params: WebhookGetNextJournalEntriesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal/2026-03/offset/{offset}/next
        withRawResponse().getNextJournalEntries(params, requestOptions)

    override fun getNextLocalJournalEntries(
        params: WebhookGetNextLocalJournalEntriesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /webhooks-journal/journal-local/2026-03/offset/{offset}/next
        withRawResponse().getNextLocalJournalEntries(params, requestOptions)

    override fun getSettings(
        params: WebhookGetSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // get /webhooks/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).thenApply { it.parse() }

    override fun getSubscriptionFilter(
        params: WebhookGetSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterResponse> =
        // get /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().getSubscriptionFilter(params, requestOptions).thenApply { it.parse() }

    override fun listEventSubscriptions(
        params: WebhookListEventSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        // get /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().listEventSubscriptions(params, requestOptions).thenApply { it.parse() }

    override fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        // get /webhooks-journal/subscriptions/2026-03
        withRawResponse().listJournalSubscriptions(params, requestOptions).thenApply { it.parse() }

    override fun listSubscriptionFilters(
        params: WebhookListSubscriptionFiltersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        // get /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}
        withRawResponse().listSubscriptionFilters(params, requestOptions).thenApply { it.parse() }

    override fun updateEventSubscription(
        params: WebhookUpdateEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        // patch /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().updateEventSubscription(params, requestOptions).thenApply { it.parse() }

    override fun updateSettings(
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // put /webhooks/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createBatchEventSubscriptionsHandler:
            Handler<BatchResponseSubscriptionResponse> =
            jsonHandler<BatchResponseSubscriptionResponse>(clientOptions.jsonMapper)

        override fun createBatchEventSubscriptions(
            params: WebhookCreateBatchEventSubscriptionsParams,
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
                        "webhooks",
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
                            .use { createBatchEventSubscriptionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createCrmSnapshotsHandler: Handler<CrmObjectSnapshotBatchResponse> =
            jsonHandler<CrmObjectSnapshotBatchResponse>(clientOptions.jsonMapper)

        override fun createCrmSnapshots(
            params: WebhookCreateCrmSnapshotsParams,
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
                            .use { createCrmSnapshotsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createEventSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun createEventSubscription(
            params: WebhookCreateEventSubscriptionParams,
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
                            .use { createEventSubscriptionHandler.handle(it) }
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
            params: WebhookCreateJournalSubscriptionParams,
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

        private val createSubscriptionFilterHandler: Handler<FilterCreateResponse> =
            jsonHandler<FilterCreateResponse>(clientOptions.jsonMapper)

        override fun createSubscriptionFilter(
            params: WebhookCreateSubscriptionFilterParams,
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

        private val deleteEventSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteEventSubscription(
            params: WebhookDeleteEventSubscriptionParams,
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
                        response.use { deleteEventSubscriptionHandler.handle(it) }
                    }
                }
        }

        private val deleteJournalSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteJournalSubscription(
            params: WebhookDeleteJournalSubscriptionParams,
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

        private val deleteJournalSubscriptionForPortalHandler: Handler<Void?> = emptyHandler()

        override fun deleteJournalSubscriptionForPortal(
            params: WebhookDeleteJournalSubscriptionForPortalParams,
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
                        response.use { deleteJournalSubscriptionForPortalHandler.handle(it) }
                    }
                }
        }

        private val deleteSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteSettings(
            params: WebhookDeleteSettingsParams,
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

        private val deleteSubscriptionFilterHandler: Handler<Void?> = emptyHandler()

        override fun deleteSubscriptionFilter(
            params: WebhookDeleteSubscriptionFilterParams,
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

        private val getEarliestJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getEarliestJournalBatch(
            params: WebhookGetEarliestJournalBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "batch",
                        "earliest",
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
                            .use { getEarliestJournalBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun getEarliestJournalEntry(
            params: WebhookGetEarliestJournalEntryParams,
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

        private val getEarliestLocalJournalBatchHandler:
            Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getEarliestLocalJournalBatch(
            params: WebhookGetEarliestLocalJournalBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        "earliest",
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
                            .use { getEarliestLocalJournalBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun getEarliestLocalJournalEntry(
            params: WebhookGetEarliestLocalJournalEntryParams,
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

        private val getEventSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun getEventSubscription(
            params: WebhookGetEventSubscriptionParams,
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
                            .use { getEventSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getJournalBatchByRequestHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getJournalBatchByRequest(
            params: WebhookGetJournalBatchByRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getJournalBatchByRequestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getJournalBatchFromOffsetHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getJournalBatchFromOffset(
            params: WebhookGetJournalBatchFromOffsetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "batch",
                        params._pathParam(0),
                        "next",
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
                            .use { getJournalBatchFromOffsetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getJournalStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getJournalStatus(
            params: WebhookGetJournalStatusParams,
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

        private val getJournalSubscriptionHandler: Handler<SubscriptionResponse1> =
            jsonHandler<SubscriptionResponse1>(clientOptions.jsonMapper)

        override fun getJournalSubscription(
            params: WebhookGetJournalSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> {
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
                            .use { getJournalSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLatestJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLatestJournalBatch(
            params: WebhookGetLatestJournalBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "batch",
                        "latest",
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
                            .use { getLatestJournalBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun getLatestJournalEntry(
            params: WebhookGetLatestJournalEntryParams,
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

        private val getLatestLocalJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLatestLocalJournalBatch(
            params: WebhookGetLatestLocalJournalBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        "latest",
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
                            .use { getLatestLocalJournalBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun getLatestLocalJournalEntry(
            params: WebhookGetLatestLocalJournalEntryParams,
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

        private val getLocalJournalBatchByRequestHandler:
            Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalBatchByRequest(
            params: WebhookGetLocalJournalBatchByRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        "read",
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
                            .use { getLocalJournalBatchByRequestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocalJournalBatchFromOffsetHandler:
            Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalBatchFromOffset(
            params: WebhookGetLocalJournalBatchFromOffsetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        params._pathParam(0),
                        "next",
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
                            .use { getLocalJournalBatchFromOffsetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocalJournalStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalStatus(
            params: WebhookGetLocalJournalStatusParams,
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

        override fun getNextJournalEntries(
            params: WebhookGetNextJournalEntriesParams,
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

        override fun getNextLocalJournalEntries(
            params: WebhookGetNextLocalJournalEntriesParams,
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

        private val getSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun getSettings(
            params: WebhookGetSettingsParams,
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

        private val getSubscriptionFilterHandler: Handler<FilterResponse> =
            jsonHandler<FilterResponse>(clientOptions.jsonMapper)

        override fun getSubscriptionFilter(
            params: WebhookGetSubscriptionFilterParams,
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

        private val listEventSubscriptionsHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun listEventSubscriptions(
            params: WebhookListEventSubscriptionsParams,
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
                            .use { listEventSubscriptionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listJournalSubscriptionsHandler:
            Handler<CollectionResponseSubscriptionResponseNoPaging> =
            jsonHandler<CollectionResponseSubscriptionResponseNoPaging>(clientOptions.jsonMapper)

        override fun listJournalSubscriptions(
            params: WebhookListJournalSubscriptionsParams,
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

        private val listSubscriptionFiltersHandler: Handler<List<FilterResponse>> =
            jsonHandler<List<FilterResponse>>(clientOptions.jsonMapper)

        override fun listSubscriptionFilters(
            params: WebhookListSubscriptionFiltersParams,
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
                            .use { listSubscriptionFiltersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val updateEventSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun updateEventSubscription(
            params: WebhookUpdateEventSubscriptionParams,
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
                            .use { updateEventSubscriptionHandler.handle(it) }
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
            params: WebhookUpdateSettingsParams,
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
    }
}
