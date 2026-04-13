// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.client

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.getPackageVersion
import com.hubspot.sdk.services.async.AccountServiceAsync
import com.hubspot.sdk.services.async.AccountServiceAsyncImpl
import com.hubspot.sdk.services.async.AuthServiceAsync
import com.hubspot.sdk.services.async.AuthServiceAsyncImpl
import com.hubspot.sdk.services.async.AutomationServiceAsync
import com.hubspot.sdk.services.async.AutomationServiceAsyncImpl
import com.hubspot.sdk.services.async.BusinessUnitServiceAsync
import com.hubspot.sdk.services.async.BusinessUnitServiceAsyncImpl
import com.hubspot.sdk.services.async.CmServiceAsync
import com.hubspot.sdk.services.async.CmServiceAsyncImpl
import com.hubspot.sdk.services.async.CommunicationPreferenceServiceAsync
import com.hubspot.sdk.services.async.CommunicationPreferenceServiceAsyncImpl
import com.hubspot.sdk.services.async.ConversationServiceAsync
import com.hubspot.sdk.services.async.ConversationServiceAsyncImpl
import com.hubspot.sdk.services.async.CrmServiceAsync
import com.hubspot.sdk.services.async.CrmServiceAsyncImpl
import com.hubspot.sdk.services.async.EventServiceAsync
import com.hubspot.sdk.services.async.EventServiceAsyncImpl
import com.hubspot.sdk.services.async.FileServiceAsync
import com.hubspot.sdk.services.async.FileServiceAsyncImpl
import com.hubspot.sdk.services.async.MarketingServiceAsync
import com.hubspot.sdk.services.async.MarketingServiceAsyncImpl
import com.hubspot.sdk.services.async.MetaServiceAsync
import com.hubspot.sdk.services.async.MetaServiceAsyncImpl
import com.hubspot.sdk.services.async.SchedulerServiceAsync
import com.hubspot.sdk.services.async.SchedulerServiceAsyncImpl
import com.hubspot.sdk.services.async.SettingServiceAsync
import com.hubspot.sdk.services.async.SettingServiceAsyncImpl
import com.hubspot.sdk.services.async.WebhookServiceAsync
import com.hubspot.sdk.services.async.WebhookServiceAsyncImpl
import java.util.function.Consumer

class HubSpotClientAsyncImpl(private val clientOptions: ClientOptions) : HubSpotClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: HubSpotClient by lazy { HubSpotClientImpl(clientOptions) }

    private val withRawResponse: HubSpotClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val automation: AutomationServiceAsync by lazy {
        AutomationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val businessUnits: BusinessUnitServiceAsync by lazy {
        BusinessUnitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cms: CmServiceAsync by lazy { CmServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val communicationPreferences: CommunicationPreferenceServiceAsync by lazy {
        CommunicationPreferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val conversations: ConversationServiceAsync by lazy {
        ConversationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val crm: CrmServiceAsync by lazy { CrmServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val marketing: MarketingServiceAsync by lazy {
        MarketingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val meta: MetaServiceAsync by lazy { MetaServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val scheduler: SchedulerServiceAsync by lazy {
        SchedulerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingServiceAsync by lazy {
        SettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): HubSpotClient = sync

    override fun withRawResponse(): HubSpotClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubSpotClientAsync =
        HubSpotClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountServiceAsync = account

    override fun auth(): AuthServiceAsync = auth

    override fun automation(): AutomationServiceAsync = automation

    override fun businessUnits(): BusinessUnitServiceAsync = businessUnits

    override fun cms(): CmServiceAsync = cms

    override fun communicationPreferences(): CommunicationPreferenceServiceAsync =
        communicationPreferences

    override fun conversations(): ConversationServiceAsync = conversations

    override fun crm(): CrmServiceAsync = crm

    override fun events(): EventServiceAsync = events

    override fun files(): FileServiceAsync = files

    override fun marketing(): MarketingServiceAsync = marketing

    override fun meta(): MetaServiceAsync = meta

    override fun scheduler(): SchedulerServiceAsync = scheduler

    override fun settings(): SettingServiceAsync = settings

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubSpotClientAsync.WithRawResponse {

        private val account: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val auth: AuthServiceAsync.WithRawResponse by lazy {
            AuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val automation: AutomationServiceAsync.WithRawResponse by lazy {
            AutomationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val businessUnits: BusinessUnitServiceAsync.WithRawResponse by lazy {
            BusinessUnitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cms: CmServiceAsync.WithRawResponse by lazy {
            CmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val communicationPreferences:
            CommunicationPreferenceServiceAsync.WithRawResponse by lazy {
            CommunicationPreferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conversations: ConversationServiceAsync.WithRawResponse by lazy {
            ConversationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val crm: CrmServiceAsync.WithRawResponse by lazy {
            CrmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketing: MarketingServiceAsync.WithRawResponse by lazy {
            MarketingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val meta: MetaServiceAsync.WithRawResponse by lazy {
            MetaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduler: SchedulerServiceAsync.WithRawResponse by lazy {
            SchedulerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubSpotClientAsync.WithRawResponse =
            HubSpotClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountServiceAsync.WithRawResponse = account

        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        override fun automation(): AutomationServiceAsync.WithRawResponse = automation

        override fun businessUnits(): BusinessUnitServiceAsync.WithRawResponse = businessUnits

        override fun cms(): CmServiceAsync.WithRawResponse = cms

        override fun communicationPreferences():
            CommunicationPreferenceServiceAsync.WithRawResponse = communicationPreferences

        override fun conversations(): ConversationServiceAsync.WithRawResponse = conversations

        override fun crm(): CrmServiceAsync.WithRawResponse = crm

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun marketing(): MarketingServiceAsync.WithRawResponse = marketing

        override fun meta(): MetaServiceAsync.WithRawResponse = meta

        override fun scheduler(): SchedulerServiceAsync.WithRawResponse = scheduler

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
