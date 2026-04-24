// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

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
import com.hubspot.sdk.core.prepare
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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createBatchEventSubscriptions(
        params: WebhookCreateBatchEventSubscriptionsParams,
        requestOptions: RequestOptions,
    ): BatchResponseSubscriptionResponse =
        // post /webhooks/2026-03/{appId}/subscriptions/batch/update
        withRawResponse().createBatchEventSubscriptions(params, requestOptions).parse()

    override fun createCrmSnapshots(
        params: WebhookCreateCrmSnapshotsParams,
        requestOptions: RequestOptions,
    ): CrmObjectSnapshotBatchResponse =
        // post /webhooks-journal/snapshots/2026-03/crm
        withRawResponse().createCrmSnapshots(params, requestOptions).parse()

    override fun createEventSubscription(
        params: WebhookCreateEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse =
        // post /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().createEventSubscription(params, requestOptions).parse()

    override fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse1 =
        // post /webhooks-journal/subscriptions/2026-03
        withRawResponse().createJournalSubscription(params, requestOptions).parse()

    override fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): FilterCreateResponse =
        // post /webhooks-journal/subscriptions/2026-03/filters
        withRawResponse().createSubscriptionFilter(params, requestOptions).parse()

    override fun deleteEventSubscription(
        params: WebhookDeleteEventSubscriptionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().deleteEventSubscription(params, requestOptions)
    }

    override fun deleteJournalSubscription(
        params: WebhookDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks-journal/subscriptions/2026-03/{subscriptionId}
        withRawResponse().deleteJournalSubscription(params, requestOptions)
    }

    override fun deleteJournalSubscriptionForPortal(
        params: WebhookDeleteJournalSubscriptionForPortalParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks-journal/subscriptions/2026-03/portals/{portalId}
        withRawResponse().deleteJournalSubscriptionForPortal(params, requestOptions)
    }

    override fun deleteSettings(
        params: WebhookDeleteSettingsParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions)
    }

    override fun deleteSubscriptionFilter(
        params: WebhookDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().deleteSubscriptionFilter(params, requestOptions)
    }

    override fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal/2026-03/batch/earliest/{count}
        withRawResponse().getEarliestJournalBatch(params, requestOptions).parse()

    override fun getEarliestJournalEntry(
        params: WebhookGetEarliestJournalEntryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/earliest
        withRawResponse().getEarliestJournalEntry(params, requestOptions)

    override fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal-local/2026-03/batch/earliest/{count}
        withRawResponse().getEarliestLocalJournalBatch(params, requestOptions).parse()

    override fun getEarliestLocalJournalEntry(
        params: WebhookGetEarliestLocalJournalEntryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/earliest
        withRawResponse().getEarliestLocalJournalEntry(params, requestOptions)

    override fun getEventSubscription(
        params: WebhookGetEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse =
        // get /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().getEventSubscription(params, requestOptions).parse()

    override fun getJournalBatchByRequest(
        params: WebhookGetJournalBatchByRequestParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // post /webhooks-journal/journal/2026-03/batch/read
        withRawResponse().getJournalBatchByRequest(params, requestOptions).parse()

    override fun getJournalBatchFromOffset(
        params: WebhookGetJournalBatchFromOffsetParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}
        withRawResponse().getJournalBatchFromOffset(params, requestOptions).parse()

    override fun getJournalStatus(
        params: WebhookGetJournalStatusParams,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        // get /webhooks-journal/journal/2026-03/status/{statusId}
        withRawResponse().getJournalStatus(params, requestOptions).parse()

    override fun getJournalSubscription(
        params: WebhookGetJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse1 =
        // get /webhooks-journal/subscriptions/2026-03/{subscriptionId}
        withRawResponse().getJournalSubscription(params, requestOptions).parse()

    override fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal/2026-03/batch/latest/{count}
        withRawResponse().getLatestJournalBatch(params, requestOptions).parse()

    override fun getLatestJournalEntry(
        params: WebhookGetLatestJournalEntryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/latest
        withRawResponse().getLatestJournalEntry(params, requestOptions)

    override fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal-local/2026-03/batch/latest/{count}
        withRawResponse().getLatestLocalJournalBatch(params, requestOptions).parse()

    override fun getLatestLocalJournalEntry(
        params: WebhookGetLatestLocalJournalEntryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/latest
        withRawResponse().getLatestLocalJournalEntry(params, requestOptions)

    override fun getLocalJournalBatchByRequest(
        params: WebhookGetLocalJournalBatchByRequestParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // post /webhooks-journal/journal-local/2026-03/batch/read
        withRawResponse().getLocalJournalBatchByRequest(params, requestOptions).parse()

    override fun getLocalJournalBatchFromOffset(
        params: WebhookGetLocalJournalBatchFromOffsetParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}
        withRawResponse().getLocalJournalBatchFromOffset(params, requestOptions).parse()

    override fun getLocalJournalStatus(
        params: WebhookGetLocalJournalStatusParams,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        // get /webhooks-journal/journal-local/2026-03/status/{statusId}
        withRawResponse().getLocalJournalStatus(params, requestOptions).parse()

    override fun getNextJournalEntries(
        params: WebhookGetNextJournalEntriesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/offset/{offset}/next
        withRawResponse().getNextJournalEntries(params, requestOptions)

    override fun getNextLocalJournalEntries(
        params: WebhookGetNextLocalJournalEntriesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/offset/{offset}/next
        withRawResponse().getNextLocalJournalEntries(params, requestOptions)

    override fun getSettings(
        params: WebhookGetSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // get /webhooks/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).parse()

    override fun getSubscriptionFilter(
        params: WebhookGetSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): FilterResponse =
        // get /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().getSubscriptionFilter(params, requestOptions).parse()

    override fun listEventSubscriptions(
        params: WebhookListEventSubscriptionsParams,
        requestOptions: RequestOptions,
    ): SubscriptionListResponse =
        // get /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().listEventSubscriptions(params, requestOptions).parse()

    override fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseSubscriptionResponseNoPaging =
        // get /webhooks-journal/subscriptions/2026-03
        withRawResponse().listJournalSubscriptions(params, requestOptions).parse()

    override fun listSubscriptionFilters(
        params: WebhookListSubscriptionFiltersParams,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        // get /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}
        withRawResponse().listSubscriptionFilters(params, requestOptions).parse()

    override fun updateEventSubscription(
        params: WebhookUpdateEventSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse =
        // patch /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().updateEventSubscription(params, requestOptions).parse()

    override fun updateSettings(
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // put /webhooks/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createBatchEventSubscriptionsHandler:
            Handler<BatchResponseSubscriptionResponse> =
            jsonHandler<BatchResponseSubscriptionResponse>(clientOptions.jsonMapper)

        override fun createBatchEventSubscriptions(
            params: WebhookCreateBatchEventSubscriptionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBatchEventSubscriptionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createCrmSnapshotsHandler: Handler<CrmObjectSnapshotBatchResponse> =
            jsonHandler<CrmObjectSnapshotBatchResponse>(clientOptions.jsonMapper)

        override fun createCrmSnapshots(
            params: WebhookCreateCrmSnapshotsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "snapshots", "2026-03", "crm")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createCrmSnapshotsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createEventSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun createEventSubscription(
            params: WebhookCreateEventSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEventSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createJournalSubscriptionHandler: Handler<SubscriptionResponse1> =
            jsonHandler<SubscriptionResponse1>(clientOptions.jsonMapper)

        override fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionResponse1> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createJournalSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createSubscriptionFilterHandler: Handler<FilterCreateResponse> =
            jsonHandler<FilterCreateResponse>(clientOptions.jsonMapper)

        override fun createSubscriptionFilter(
            params: WebhookCreateSubscriptionFilterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03", "filters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createSubscriptionFilterHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteEventSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteEventSubscription(
            params: WebhookDeleteEventSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteEventSubscriptionHandler.handle(it) }
            }
        }

        private val deleteJournalSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteJournalSubscription(
            params: WebhookDeleteJournalSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteJournalSubscriptionHandler.handle(it) }
            }
        }

        private val deleteJournalSubscriptionForPortalHandler: Handler<Void?> = emptyHandler()

        override fun deleteJournalSubscriptionForPortal(
            params: WebhookDeleteJournalSubscriptionForPortalParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteJournalSubscriptionForPortalHandler.handle(it) }
            }
        }

        private val deleteSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteSettings(
            params: WebhookDeleteSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteSettingsHandler.handle(it) }
            }
        }

        private val deleteSubscriptionFilterHandler: Handler<Void?> = emptyHandler()

        override fun deleteSubscriptionFilter(
            params: WebhookDeleteSubscriptionFilterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteSubscriptionFilterHandler.handle(it) }
            }
        }

        private val getEarliestJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getEarliestJournalBatch(
            params: WebhookGetEarliestJournalBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEarliestJournalBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun getEarliestJournalEntry(
            params: WebhookGetEarliestJournalEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "earliest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getEarliestLocalJournalBatchHandler:
            Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getEarliestLocalJournalBatch(
            params: WebhookGetEarliestLocalJournalBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEarliestLocalJournalBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun getEarliestLocalJournalEntry(
            params: WebhookGetEarliestLocalJournalEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal-local", "2026-03", "earliest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getEventSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun getEventSubscription(
            params: WebhookGetEventSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEventSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getJournalBatchByRequestHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getJournalBatchByRequest(
            params: WebhookGetJournalBatchByRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getJournalBatchByRequestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getJournalBatchFromOffsetHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getJournalBatchFromOffset(
            params: WebhookGetJournalBatchFromOffsetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getJournalBatchFromOffsetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getJournalStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getJournalStatus(
            params: WebhookGetJournalStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getJournalStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getJournalSubscriptionHandler: Handler<SubscriptionResponse1> =
            jsonHandler<SubscriptionResponse1>(clientOptions.jsonMapper)

        override fun getJournalSubscription(
            params: WebhookGetJournalSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionResponse1> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getJournalSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLatestJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLatestJournalBatch(
            params: WebhookGetLatestJournalBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLatestJournalBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun getLatestJournalEntry(
            params: WebhookGetLatestJournalEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "latest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getLatestLocalJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLatestLocalJournalBatch(
            params: WebhookGetLatestLocalJournalBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLatestLocalJournalBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun getLatestLocalJournalEntry(
            params: WebhookGetLatestLocalJournalEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal-local", "2026-03", "latest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getLocalJournalBatchByRequestHandler:
            Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalBatchByRequest(
            params: WebhookGetLocalJournalBatchByRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocalJournalBatchByRequestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BatchResponseJournalFetchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocalJournalBatchFromOffsetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLocalJournalStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalStatus(
            params: WebhookGetLocalJournalStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocalJournalStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun getNextJournalEntries(
            params: WebhookGetNextJournalEntriesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getNextLocalJournalEntries(
            params: WebhookGetNextLocalJournalEntriesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun getSettings(
            params: WebhookGetSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSubscriptionFilterHandler: Handler<FilterResponse> =
            jsonHandler<FilterResponse>(clientOptions.jsonMapper)

        override fun getSubscriptionFilter(
            params: WebhookGetSubscriptionFilterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSubscriptionFilterHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEventSubscriptionsHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun listEventSubscriptions(
            params: WebhookListEventSubscriptionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "2026-03", params._pathParam(0), "subscriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventSubscriptionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listJournalSubscriptionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listSubscriptionFiltersHandler: Handler<List<FilterResponse>> =
            jsonHandler<List<FilterResponse>>(clientOptions.jsonMapper)

        override fun listSubscriptionFilters(
            params: WebhookListSubscriptionFiltersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterResponse>> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSubscriptionFiltersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateEventSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun updateEventSubscription(
            params: WebhookUpdateEventSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateEventSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun updateSettings(
            params: WebhookUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
