// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.webhooksjournal.JournalLocalService
import com.hubspot.sdk.services.blocking.webhooksjournal.JournalLocalServiceImpl
import com.hubspot.sdk.services.blocking.webhooksjournal.JournalService
import com.hubspot.sdk.services.blocking.webhooksjournal.JournalServiceImpl
import com.hubspot.sdk.services.blocking.webhooksjournal.SnapshotService
import com.hubspot.sdk.services.blocking.webhooksjournal.SnapshotServiceImpl
import com.hubspot.sdk.services.blocking.webhooksjournal.SubscriptionService
import com.hubspot.sdk.services.blocking.webhooksjournal.SubscriptionServiceImpl
import java.util.function.Consumer

class WebhooksJournalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhooksJournalService {

    private val withRawResponse: WebhooksJournalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val journal: JournalService by lazy { JournalServiceImpl(clientOptions) }

    private val journalLocal: JournalLocalService by lazy { JournalLocalServiceImpl(clientOptions) }

    private val snapshots: SnapshotService by lazy { SnapshotServiceImpl(clientOptions) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): WebhooksJournalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhooksJournalService =
        WebhooksJournalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun journal(): JournalService = journal

    override fun journalLocal(): JournalLocalService = journalLocal

    override fun snapshots(): SnapshotService = snapshots

    override fun subscriptions(): SubscriptionService = subscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhooksJournalService.WithRawResponse {

        private val journal: JournalService.WithRawResponse by lazy {
            JournalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val journalLocal: JournalLocalService.WithRawResponse by lazy {
            JournalLocalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotService.WithRawResponse by lazy {
            SnapshotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhooksJournalService.WithRawResponse =
            WebhooksJournalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun journal(): JournalService.WithRawResponse = journal

        override fun journalLocal(): JournalLocalService.WithRawResponse = journalLocal

        override fun snapshots(): SnapshotService.WithRawResponse = snapshots

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions
    }
}
