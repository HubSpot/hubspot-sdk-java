// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.client

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.AccountServiceAsync
import com.hubspot_sdk.api.services.async.AuthServiceAsync
import com.hubspot_sdk.api.services.async.AutomationServiceAsync
import com.hubspot_sdk.api.services.async.BusinessUnitServiceAsync
import com.hubspot_sdk.api.services.async.CmServiceAsync
import com.hubspot_sdk.api.services.async.ConversationServiceAsync
import com.hubspot_sdk.api.services.async.CrmServiceAsync
import com.hubspot_sdk.api.services.async.EventServiceAsync
import com.hubspot_sdk.api.services.async.FileServiceAsync
import com.hubspot_sdk.api.services.async.MarketingServiceAsync
import com.hubspot_sdk.api.services.async.SchedulerServiceAsync
import com.hubspot_sdk.api.services.async.SettingServiceAsync
import com.hubspot_sdk.api.services.async.WebhookServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Hub Spot REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface HubSpotClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): HubSpotClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubSpotClientAsync

    fun account(): AccountServiceAsync

    fun auth(): AuthServiceAsync

    fun automation(): AutomationServiceAsync

    fun businessUnits(): BusinessUnitServiceAsync

    fun cms(): CmServiceAsync

    fun conversations(): ConversationServiceAsync

    fun crm(): CrmServiceAsync

    fun events(): EventServiceAsync

    fun files(): FileServiceAsync

    fun marketing(): MarketingServiceAsync

    fun scheduler(): SchedulerServiceAsync

    fun settings(): SettingServiceAsync

    fun webhooks(): WebhookServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [HubSpotClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubSpotClientAsync.WithRawResponse

        fun account(): AccountServiceAsync.WithRawResponse

        fun auth(): AuthServiceAsync.WithRawResponse

        fun automation(): AutomationServiceAsync.WithRawResponse

        fun businessUnits(): BusinessUnitServiceAsync.WithRawResponse

        fun cms(): CmServiceAsync.WithRawResponse

        fun conversations(): ConversationServiceAsync.WithRawResponse

        fun crm(): CrmServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        fun marketing(): MarketingServiceAsync.WithRawResponse

        fun scheduler(): SchedulerServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse
    }
}
