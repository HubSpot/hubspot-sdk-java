// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.client

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.AccountService
import com.hubspot_sdk.api.services.blocking.AuthService
import com.hubspot_sdk.api.services.blocking.AutomationService
import com.hubspot_sdk.api.services.blocking.BusinessUnitService
import com.hubspot_sdk.api.services.blocking.CmService
import com.hubspot_sdk.api.services.blocking.CommunicationPreferenceService
import com.hubspot_sdk.api.services.blocking.ConversationService
import com.hubspot_sdk.api.services.blocking.CrmService
import com.hubspot_sdk.api.services.blocking.EventService
import com.hubspot_sdk.api.services.blocking.FileService
import com.hubspot_sdk.api.services.blocking.MarketingService
import com.hubspot_sdk.api.services.blocking.MetaService
import com.hubspot_sdk.api.services.blocking.SchedulerService
import com.hubspot_sdk.api.services.blocking.SettingService
import com.hubspot_sdk.api.services.blocking.WebhookService
import java.util.function.Consumer

/**
 * A client for interacting with the HubSpot REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface HubSpotClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): HubSpotClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubSpotClient

    fun account(): AccountService

    fun auth(): AuthService

    fun automation(): AutomationService

    fun businessUnits(): BusinessUnitService

    fun cms(): CmService

    fun communicationPreferences(): CommunicationPreferenceService

    fun conversations(): ConversationService

    fun crm(): CrmService

    fun events(): EventService

    fun files(): FileService

    fun marketing(): MarketingService

    fun meta(): MetaService

    fun scheduler(): SchedulerService

    fun settings(): SettingService

    fun webhooks(): WebhookService

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

    /** A view of [HubSpotClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubSpotClient.WithRawResponse

        fun account(): AccountService.WithRawResponse

        fun auth(): AuthService.WithRawResponse

        fun automation(): AutomationService.WithRawResponse

        fun businessUnits(): BusinessUnitService.WithRawResponse

        fun cms(): CmService.WithRawResponse

        fun communicationPreferences(): CommunicationPreferenceService.WithRawResponse

        fun conversations(): ConversationService.WithRawResponse

        fun crm(): CrmService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun files(): FileService.WithRawResponse

        fun marketing(): MarketingService.WithRawResponse

        fun meta(): MetaService.WithRawResponse

        fun scheduler(): SchedulerService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse
    }
}
