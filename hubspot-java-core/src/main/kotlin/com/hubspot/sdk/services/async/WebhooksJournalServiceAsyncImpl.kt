// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.webhooksjournal.JournalLocalServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.JournalLocalServiceAsyncImpl
import com.hubspot.sdk.services.async.webhooksjournal.JournalServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.JournalServiceAsyncImpl
import com.hubspot.sdk.services.async.webhooksjournal.SnapshotServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.SnapshotServiceAsyncImpl
import com.hubspot.sdk.services.async.webhooksjournal.SubscriptionServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.SubscriptionServiceAsyncImpl
import java.util.function.Consumer

class WebhooksJournalServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WebhooksJournalServiceAsync {

    private val withRawResponse: WebhooksJournalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val journal: JournalServiceAsync by lazy { JournalServiceAsyncImpl(clientOptions) }

    private val journalLocal: JournalLocalServiceAsync by lazy {
        JournalLocalServiceAsyncImpl(clientOptions)
    }

    private val snapshots: SnapshotServiceAsync by lazy { SnapshotServiceAsyncImpl(clientOptions) }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): WebhooksJournalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WebhooksJournalServiceAsync =
        WebhooksJournalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun journal(): JournalServiceAsync = journal

    override fun journalLocal(): JournalLocalServiceAsync = journalLocal

    override fun snapshots(): SnapshotServiceAsync = snapshots

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhooksJournalServiceAsync.WithRawResponse {

        private val journal: JournalServiceAsync.WithRawResponse by lazy {
            JournalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val journalLocal: JournalLocalServiceAsync.WithRawResponse by lazy {
            JournalLocalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotServiceAsync.WithRawResponse by lazy {
            SnapshotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhooksJournalServiceAsync.WithRawResponse =
            WebhooksJournalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun journal(): JournalServiceAsync.WithRawResponse = journal

        override fun journalLocal(): JournalLocalServiceAsync.WithRawResponse = journalLocal

        override fun snapshots(): SnapshotServiceAsync.WithRawResponse = snapshots

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions
    }
}
