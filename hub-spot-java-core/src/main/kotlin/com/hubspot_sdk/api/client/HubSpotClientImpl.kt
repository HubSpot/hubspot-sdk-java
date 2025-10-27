// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.client

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.getPackageVersion
import com.hubspot_sdk.api.services.blocking.AccountService
import com.hubspot_sdk.api.services.blocking.AccountServiceImpl
import com.hubspot_sdk.api.services.blocking.AuthService
import com.hubspot_sdk.api.services.blocking.AuthServiceImpl
import com.hubspot_sdk.api.services.blocking.AutomationService
import com.hubspot_sdk.api.services.blocking.AutomationServiceImpl
import com.hubspot_sdk.api.services.blocking.BusinessUnitService
import com.hubspot_sdk.api.services.blocking.BusinessUnitServiceImpl
import com.hubspot_sdk.api.services.blocking.CmService
import com.hubspot_sdk.api.services.blocking.CmServiceImpl
import com.hubspot_sdk.api.services.blocking.ConversationService
import com.hubspot_sdk.api.services.blocking.ConversationServiceImpl
import com.hubspot_sdk.api.services.blocking.CrmService
import com.hubspot_sdk.api.services.blocking.CrmServiceImpl
import com.hubspot_sdk.api.services.blocking.EventService
import com.hubspot_sdk.api.services.blocking.EventServiceImpl
import com.hubspot_sdk.api.services.blocking.FileService
import com.hubspot_sdk.api.services.blocking.FileServiceImpl
import com.hubspot_sdk.api.services.blocking.MarketingService
import com.hubspot_sdk.api.services.blocking.MarketingServiceImpl
import com.hubspot_sdk.api.services.blocking.SchedulerService
import com.hubspot_sdk.api.services.blocking.SchedulerServiceImpl
import com.hubspot_sdk.api.services.blocking.SettingService
import com.hubspot_sdk.api.services.blocking.SettingServiceImpl
import com.hubspot_sdk.api.services.blocking.WebhookService
import com.hubspot_sdk.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class HubSpotClientImpl(private val clientOptions: ClientOptions) : HubSpotClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: HubSpotClientAsync by lazy { HubSpotClientAsyncImpl(clientOptions) }

    private val withRawResponse: HubSpotClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val automation: AutomationService by lazy {
        AutomationServiceImpl(clientOptionsWithUserAgent)
    }

    private val businessUnits: BusinessUnitService by lazy {
        BusinessUnitServiceImpl(clientOptionsWithUserAgent)
    }

    private val cms: CmService by lazy { CmServiceImpl(clientOptionsWithUserAgent) }

    private val conversations: ConversationService by lazy {
        ConversationServiceImpl(clientOptionsWithUserAgent)
    }

    private val crm: CrmService by lazy { CrmServiceImpl(clientOptionsWithUserAgent) }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val marketing: MarketingService by lazy {
        MarketingServiceImpl(clientOptionsWithUserAgent)
    }

    private val scheduler: SchedulerService by lazy {
        SchedulerServiceImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HubSpotClientAsync = async

    override fun withRawResponse(): HubSpotClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubSpotClient =
        HubSpotClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountService = account

    override fun auth(): AuthService = auth

    override fun automation(): AutomationService = automation

    override fun businessUnits(): BusinessUnitService = businessUnits

    override fun cms(): CmService = cms

    override fun conversations(): ConversationService = conversations

    override fun crm(): CrmService = crm

    override fun events(): EventService = events

    override fun files(): FileService = files

    override fun marketing(): MarketingService = marketing

    override fun scheduler(): SchedulerService = scheduler

    override fun settings(): SettingService = settings

    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubSpotClient.WithRawResponse {

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val auth: AuthService.WithRawResponse by lazy {
            AuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val automation: AutomationService.WithRawResponse by lazy {
            AutomationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val businessUnits: BusinessUnitService.WithRawResponse by lazy {
            BusinessUnitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cms: CmService.WithRawResponse by lazy {
            CmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conversations: ConversationService.WithRawResponse by lazy {
            ConversationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val crm: CrmService.WithRawResponse by lazy {
            CrmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketing: MarketingService.WithRawResponse by lazy {
            MarketingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduler: SchedulerService.WithRawResponse by lazy {
            SchedulerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubSpotClient.WithRawResponse =
            HubSpotClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountService.WithRawResponse = account

        override fun auth(): AuthService.WithRawResponse = auth

        override fun automation(): AutomationService.WithRawResponse = automation

        override fun businessUnits(): BusinessUnitService.WithRawResponse = businessUnits

        override fun cms(): CmService.WithRawResponse = cms

        override fun conversations(): ConversationService.WithRawResponse = conversations

        override fun crm(): CrmService.WithRawResponse = crm

        override fun events(): EventService.WithRawResponse = events

        override fun files(): FileService.WithRawResponse = files

        override fun marketing(): MarketingService.WithRawResponse = marketing

        override fun scheduler(): SchedulerService.WithRawResponse = scheduler

        override fun settings(): SettingService.WithRawResponse = settings

        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
