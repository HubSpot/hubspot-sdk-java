// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.webhooks.BatchResponseJournalFetchResponse
import com.hubspot.models.webhooks.BatchResponseSubscriptionResponse
import com.hubspot.models.webhooks.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot.models.webhooks.CrmObjectSnapshotBatchResponse
import com.hubspot.models.webhooks.FilterCreateResponse
import com.hubspot.models.webhooks.FilterResponse
import com.hubspot.models.webhooks.SettingsResponse
import com.hubspot.models.webhooks.SnapshotStatusResponse
import com.hubspot.models.webhooks.SubscriptionListResponse
import com.hubspot.models.webhooks.SubscriptionResponse
import com.hubspot.models.webhooks.SubscriptionResponse1
import com.hubspot.models.webhooks.WebhookCreateCrmSnapshotParams
import com.hubspot.models.webhooks.WebhookCreateJournalSubscriptionParams
import com.hubspot.models.webhooks.WebhookCreateSubscriptionFilterParams
import com.hubspot.models.webhooks.WebhookCreateSubscriptionParams
import com.hubspot.models.webhooks.WebhookCreateSubscriptionsBatchParams
import com.hubspot.models.webhooks.WebhookDeleteJournalSubscriptionParams
import com.hubspot.models.webhooks.WebhookDeletePortalSubscriptionsParams
import com.hubspot.models.webhooks.WebhookDeleteSettingsParams
import com.hubspot.models.webhooks.WebhookDeleteSubscriptionFilterParams
import com.hubspot.models.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetEarliestJournalParams
import com.hubspot.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetEarliestLocalJournalParams
import com.hubspot.models.webhooks.WebhookGetJournalBatchAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetJournalStatusParams
import com.hubspot.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetLatestJournalParams
import com.hubspot.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetLatestLocalJournalParams
import com.hubspot.models.webhooks.WebhookGetLocalJournalBatchAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetLocalJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetLocalJournalStatusParams
import com.hubspot.models.webhooks.WebhookGetNextJournalAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetNextLocalJournalAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetSettingsParams
import com.hubspot.models.webhooks.WebhookGetSubscriptionFilterParams
import com.hubspot.models.webhooks.WebhookGetSubscriptionFiltersParams
import com.hubspot.models.webhooks.WebhookGetSubscriptionParams
import com.hubspot.models.webhooks.WebhookListJournalSubscriptionsParams
import com.hubspot.models.webhooks.WebhookListSubscriptionsParams
import com.hubspot.models.webhooks.WebhookUpdateSettingsParams
import com.hubspot.models.webhooks.WebhookUpdateSubscriptionParams
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

    override fun createCrmSnapshot(
        params: WebhookCreateCrmSnapshotParams,
        requestOptions: RequestOptions,
    ): CrmObjectSnapshotBatchResponse =
        // post /webhooks-journal/snapshots/2026-03/crm
        withRawResponse().createCrmSnapshot(params, requestOptions).parse()

    override fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse1 =
        // post /webhooks-journal/subscriptions/2026-03
        withRawResponse().createJournalSubscription(params, requestOptions).parse()

    override fun createSubscription(
        params: WebhookCreateSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse =
        // post /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().createSubscription(params, requestOptions).parse()

    override fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): FilterCreateResponse =
        // post /webhooks-journal/subscriptions/2026-03/filters
        withRawResponse().createSubscriptionFilter(params, requestOptions).parse()

    override fun createSubscriptionsBatch(
        params: WebhookCreateSubscriptionsBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseSubscriptionResponse =
        // post /webhooks/2026-03/{appId}/subscriptions/batch/update
        withRawResponse().createSubscriptionsBatch(params, requestOptions).parse()

    override fun deleteJournalSubscription(
        params: WebhookDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks-journal/subscriptions/2026-03/{subscriptionId}
        withRawResponse().deleteJournalSubscription(params, requestOptions)
    }

    override fun deletePortalSubscriptions(
        params: WebhookDeletePortalSubscriptionsParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks-journal/subscriptions/2026-03/portals/{portalId}
        withRawResponse().deletePortalSubscriptions(params, requestOptions)
    }

    override fun deleteSettings(
        params: WebhookDeleteSettingsParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions)
    }

    override fun deleteSubscription(
        params: WebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().deleteSubscription(params, requestOptions)
    }

    override fun deleteSubscriptionFilter(
        params: WebhookDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().deleteSubscriptionFilter(params, requestOptions)
    }

    override fun getEarliestJournal(
        params: WebhookGetEarliestJournalParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/earliest
        withRawResponse().getEarliestJournal(params, requestOptions)

    override fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal/2026-03/batch/earliest/{count}
        withRawResponse().getEarliestJournalBatch(params, requestOptions).parse()

    override fun getEarliestLocalJournal(
        params: WebhookGetEarliestLocalJournalParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/earliest
        withRawResponse().getEarliestLocalJournal(params, requestOptions)

    override fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal-local/2026-03/batch/earliest/{count}
        withRawResponse().getEarliestLocalJournalBatch(params, requestOptions).parse()

    override fun getJournalBatch(
        params: WebhookGetJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // post /webhooks-journal/journal/2026-03/batch/read
        withRawResponse().getJournalBatch(params, requestOptions).parse()

    override fun getJournalBatchAfterOffset(
        params: WebhookGetJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}
        withRawResponse().getJournalBatchAfterOffset(params, requestOptions).parse()

    override fun getJournalStatus(
        params: WebhookGetJournalStatusParams,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        // get /webhooks-journal/journal/2026-03/status/{statusId}
        withRawResponse().getJournalStatus(params, requestOptions).parse()

    override fun getLatestJournal(
        params: WebhookGetLatestJournalParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/latest
        withRawResponse().getLatestJournal(params, requestOptions)

    override fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal/2026-03/batch/latest/{count}
        withRawResponse().getLatestJournalBatch(params, requestOptions).parse()

    override fun getLatestLocalJournal(
        params: WebhookGetLatestLocalJournalParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/latest
        withRawResponse().getLatestLocalJournal(params, requestOptions)

    override fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal-local/2026-03/batch/latest/{count}
        withRawResponse().getLatestLocalJournalBatch(params, requestOptions).parse()

    override fun getLocalJournalBatch(
        params: WebhookGetLocalJournalBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // post /webhooks-journal/journal-local/2026-03/batch/read
        withRawResponse().getLocalJournalBatch(params, requestOptions).parse()

    override fun getLocalJournalBatchAfterOffset(
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        // get /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}
        withRawResponse().getLocalJournalBatchAfterOffset(params, requestOptions).parse()

    override fun getLocalJournalStatus(
        params: WebhookGetLocalJournalStatusParams,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        // get /webhooks-journal/journal-local/2026-03/status/{statusId}
        withRawResponse().getLocalJournalStatus(params, requestOptions).parse()

    override fun getNextJournalAfterOffset(
        params: WebhookGetNextJournalAfterOffsetParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/offset/{offset}/next
        withRawResponse().getNextJournalAfterOffset(params, requestOptions)

    override fun getNextLocalJournalAfterOffset(
        params: WebhookGetNextLocalJournalAfterOffsetParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/offset/{offset}/next
        withRawResponse().getNextLocalJournalAfterOffset(params, requestOptions)

    override fun getSettings(
        params: WebhookGetSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // get /webhooks/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).parse()

    override fun getSubscription(
        params: WebhookGetSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse =
        // get /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().getSubscription(params, requestOptions).parse()

    override fun getSubscriptionFilter(
        params: WebhookGetSubscriptionFilterParams,
        requestOptions: RequestOptions,
    ): FilterResponse =
        // get /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().getSubscriptionFilter(params, requestOptions).parse()

    override fun getSubscriptionFilters(
        params: WebhookGetSubscriptionFiltersParams,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        // get /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}
        withRawResponse().getSubscriptionFilters(params, requestOptions).parse()

    override fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseSubscriptionResponseNoPaging =
        // get /webhooks-journal/subscriptions/2026-03
        withRawResponse().listJournalSubscriptions(params, requestOptions).parse()

    override fun listSubscriptions(
        params: WebhookListSubscriptionsParams,
        requestOptions: RequestOptions,
    ): SubscriptionListResponse =
        // get /webhooks/2026-03/{appId}/subscriptions
        withRawResponse().listSubscriptions(params, requestOptions).parse()

    override fun updateSettings(
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // put /webhooks/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).parse()

    override fun updateSubscription(
        params: WebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions,
    ): SubscriptionResponse =
        // patch /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}
        withRawResponse().updateSubscription(params, requestOptions).parse()

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

        private val createCrmSnapshotHandler: Handler<CrmObjectSnapshotBatchResponse> =
            jsonHandler<CrmObjectSnapshotBatchResponse>(clientOptions.jsonMapper)

        override fun createCrmSnapshot(
            params: WebhookCreateCrmSnapshotParams,
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
                    .use { createCrmSnapshotHandler.handle(it) }
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

        private val createSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun createSubscription(
            params: WebhookCreateSubscriptionParams,
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
                    .use { createSubscriptionHandler.handle(it) }
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

        private val createSubscriptionsBatchHandler: Handler<BatchResponseSubscriptionResponse> =
            jsonHandler<BatchResponseSubscriptionResponse>(clientOptions.jsonMapper)

        override fun createSubscriptionsBatch(
            params: WebhookCreateSubscriptionsBatchParams,
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
                    .use { createSubscriptionsBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
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

        private val deletePortalSubscriptionsHandler: Handler<Void?> = emptyHandler()

        override fun deletePortalSubscriptions(
            params: WebhookDeletePortalSubscriptionsParams,
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
                response.use { deletePortalSubscriptionsHandler.handle(it) }
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

        private val deleteSubscriptionHandler: Handler<Void?> = emptyHandler()

        override fun deleteSubscription(
            params: WebhookDeleteSubscriptionParams,
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
                response.use { deleteSubscriptionHandler.handle(it) }
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

        override fun getEarliestJournal(
            params: WebhookGetEarliestJournalParams,
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

        override fun getEarliestLocalJournal(
            params: WebhookGetEarliestLocalJournalParams,
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

        private val getJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getJournalBatch(
            params: WebhookGetJournalBatchParams,
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
                    .use { getJournalBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getJournalBatchAfterOffsetHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getJournalBatchAfterOffset(
            params: WebhookGetJournalBatchAfterOffsetParams,
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
                    .use { getJournalBatchAfterOffsetHandler.handle(it) }
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

        override fun getLatestJournal(
            params: WebhookGetLatestJournalParams,
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

        override fun getLatestLocalJournal(
            params: WebhookGetLatestLocalJournalParams,
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

        private val getLocalJournalBatchHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalBatch(
            params: WebhookGetLocalJournalBatchParams,
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
                    .use { getLocalJournalBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLocalJournalBatchAfterOffsetHandler:
            Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalJournalBatchAfterOffset(
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
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
                    .use { getLocalJournalBatchAfterOffsetHandler.handle(it) }
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

        override fun getNextJournalAfterOffset(
            params: WebhookGetNextJournalAfterOffsetParams,
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

        override fun getNextLocalJournalAfterOffset(
            params: WebhookGetNextLocalJournalAfterOffsetParams,
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

        private val getSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun getSubscription(
            params: WebhookGetSubscriptionParams,
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
                    .use { getSubscriptionHandler.handle(it) }
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

        private val getSubscriptionFiltersHandler: Handler<List<FilterResponse>> =
            jsonHandler<List<FilterResponse>>(clientOptions.jsonMapper)

        override fun getSubscriptionFilters(
            params: WebhookGetSubscriptionFiltersParams,
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
                    .use { getSubscriptionFiltersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
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

        private val listSubscriptionsHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun listSubscriptions(
            params: WebhookListSubscriptionsParams,
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
                    .use { listSubscriptionsHandler.handle(it) }
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

        private val updateSubscriptionHandler: Handler<SubscriptionResponse> =
            jsonHandler<SubscriptionResponse>(clientOptions.jsonMapper)

        override fun updateSubscription(
            params: WebhookUpdateSubscriptionParams,
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
