// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.client

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.getPackageVersion
import com.hubspot_sdk.api.services.blocking.AccountService
import com.hubspot_sdk.api.services.blocking.AccountServiceImpl
import com.hubspot_sdk.api.services.blocking.AppWebhookService
import com.hubspot_sdk.api.services.blocking.AppWebhookServiceImpl
import com.hubspot_sdk.api.services.blocking.AuthService
import com.hubspot_sdk.api.services.blocking.AuthServiceImpl
import com.hubspot_sdk.api.services.blocking.AutomationService
import com.hubspot_sdk.api.services.blocking.AutomationServiceImpl
import com.hubspot_sdk.api.services.blocking.BusinessUnitService
import com.hubspot_sdk.api.services.blocking.BusinessUnitServiceImpl
import com.hubspot_sdk.api.services.blocking.CmService
import com.hubspot_sdk.api.services.blocking.CmServiceImpl
import com.hubspot_sdk.api.services.blocking.CommunicationPreferenceService
import com.hubspot_sdk.api.services.blocking.CommunicationPreferenceServiceImpl
import com.hubspot_sdk.api.services.blocking.ConversationService
import com.hubspot_sdk.api.services.blocking.ConversationServiceImpl
import com.hubspot_sdk.api.services.blocking.CrmService
import com.hubspot_sdk.api.services.blocking.CrmServiceImpl
import com.hubspot_sdk.api.services.blocking.DataStudioService
import com.hubspot_sdk.api.services.blocking.DataStudioServiceImpl
import com.hubspot_sdk.api.services.blocking.EventService
import com.hubspot_sdk.api.services.blocking.EventServiceImpl
import com.hubspot_sdk.api.services.blocking.FileService
import com.hubspot_sdk.api.services.blocking.FileServiceImpl
import com.hubspot_sdk.api.services.blocking.MarketingService
import com.hubspot_sdk.api.services.blocking.MarketingServiceImpl
import com.hubspot_sdk.api.services.blocking.MetaService
import com.hubspot_sdk.api.services.blocking.MetaServiceImpl
import com.hubspot_sdk.api.services.blocking.SchedulerService
import com.hubspot_sdk.api.services.blocking.SchedulerServiceImpl
import com.hubspot_sdk.api.services.blocking.SettingService
import com.hubspot_sdk.api.services.blocking.SettingServiceImpl
import java.util.function.Consumer

class HubspotClientImpl(private val clientOptions: ClientOptions) : HubspotClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: HubspotClientAsync by lazy { HubspotClientAsyncImpl(clientOptions) }

    private val withRawResponse: HubspotClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val appWebhooks: AppWebhookService by lazy {
        AppWebhookServiceImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val automation: AutomationService by lazy {
        AutomationServiceImpl(clientOptionsWithUserAgent)
    }

    private val businessUnits: BusinessUnitService by lazy {
        BusinessUnitServiceImpl(clientOptionsWithUserAgent)
    }

    private val cms: CmService by lazy { CmServiceImpl(clientOptionsWithUserAgent) }

    private val communicationPreferences: CommunicationPreferenceService by lazy {
        CommunicationPreferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val conversations: ConversationService by lazy {
        ConversationServiceImpl(clientOptionsWithUserAgent)
    }

    private val crm: CrmService by lazy { CrmServiceImpl(clientOptionsWithUserAgent) }

    private val dataStudio: DataStudioService by lazy {
        DataStudioServiceImpl(clientOptionsWithUserAgent)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val marketing: MarketingService by lazy {
        MarketingServiceImpl(clientOptionsWithUserAgent)
    }

    private val meta: MetaService by lazy { MetaServiceImpl(clientOptionsWithUserAgent) }

    private val scheduler: SchedulerService by lazy {
        SchedulerServiceImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HubspotClientAsync = async

    override fun withRawResponse(): HubspotClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubspotClient =
        HubspotClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountService = account

    override fun appWebhooks(): AppWebhookService = appWebhooks

    override fun auth(): AuthService = auth

    override fun automation(): AutomationService = automation

    override fun businessUnits(): BusinessUnitService = businessUnits

    override fun cms(): CmService = cms

    override fun communicationPreferences(): CommunicationPreferenceService =
        communicationPreferences

    override fun conversations(): ConversationService = conversations

    override fun crm(): CrmService = crm

    override fun dataStudio(): DataStudioService = dataStudio

    override fun events(): EventService = events

    override fun files(): FileService = files

    override fun marketing(): MarketingService = marketing

    override fun meta(): MetaService = meta

    override fun scheduler(): SchedulerService = scheduler

    override fun settings(): SettingService = settings

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubspotClient.WithRawResponse {

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val appWebhooks: AppWebhookService.WithRawResponse by lazy {
            AppWebhookServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val communicationPreferences:
            CommunicationPreferenceService.WithRawResponse by lazy {
            CommunicationPreferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conversations: ConversationService.WithRawResponse by lazy {
            ConversationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val crm: CrmService.WithRawResponse by lazy {
            CrmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataStudio: DataStudioService.WithRawResponse by lazy {
            DataStudioServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val meta: MetaService.WithRawResponse by lazy {
            MetaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduler: SchedulerService.WithRawResponse by lazy {
            SchedulerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubspotClient.WithRawResponse =
            HubspotClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountService.WithRawResponse = account

        override fun appWebhooks(): AppWebhookService.WithRawResponse = appWebhooks

        override fun auth(): AuthService.WithRawResponse = auth

        override fun automation(): AutomationService.WithRawResponse = automation

        override fun businessUnits(): BusinessUnitService.WithRawResponse = businessUnits

        override fun cms(): CmService.WithRawResponse = cms

        override fun communicationPreferences(): CommunicationPreferenceService.WithRawResponse =
            communicationPreferences

        override fun conversations(): ConversationService.WithRawResponse = conversations

        override fun crm(): CrmService.WithRawResponse = crm

        override fun dataStudio(): DataStudioService.WithRawResponse = dataStudio

        override fun events(): EventService.WithRawResponse = events

        override fun files(): FileService.WithRawResponse = files

        override fun marketing(): MarketingService.WithRawResponse = marketing

        override fun meta(): MetaService.WithRawResponse = meta

        override fun scheduler(): SchedulerService.WithRawResponse = scheduler

        override fun settings(): SettingService.WithRawResponse = settings
    }
}
