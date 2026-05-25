// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.webhooksjournal.JournalLocalServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.JournalServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.SnapshotServiceAsync
import com.hubspot.sdk.services.async.webhooksjournal.SubscriptionServiceAsync
import java.util.function.Consumer

interface WebhooksJournalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhooksJournalServiceAsync

    fun journal(): JournalServiceAsync

    fun journalLocal(): JournalLocalServiceAsync

    fun snapshots(): SnapshotServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    /**
     * A view of [WebhooksJournalServiceAsync] that provides access to raw HTTP responses for each
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
        ): WebhooksJournalServiceAsync.WithRawResponse

        fun journal(): JournalServiceAsync.WithRawResponse

        fun journalLocal(): JournalLocalServiceAsync.WithRawResponse

        fun snapshots(): SnapshotServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse
    }
}
