// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.webhooksjournal.JournalLocalService
import com.hubspot.sdk.services.blocking.webhooksjournal.JournalService
import com.hubspot.sdk.services.blocking.webhooksjournal.SnapshotService
import com.hubspot.sdk.services.blocking.webhooksjournal.SubscriptionService
import java.util.function.Consumer

interface WebhooksJournalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhooksJournalService

    fun journal(): JournalService

    fun journalLocal(): JournalLocalService

    fun snapshots(): SnapshotService

    fun subscriptions(): SubscriptionService

    /**
     * A view of [WebhooksJournalService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhooksJournalService.WithRawResponse

        fun journal(): JournalService.WithRawResponse

        fun journalLocal(): JournalLocalService.WithRawResponse

        fun snapshots(): SnapshotService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse
    }
}
