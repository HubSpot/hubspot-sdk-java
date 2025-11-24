// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.cms.mediabridge.Endpoints
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityChange
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainRequest
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorObjectCreationRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderPartial
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingDeleteOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateOembedDomainParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntegratorSettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createObjectDefinition() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val bulkIntegratorObjectCreationResponse =
            integratorSettingService.createObjectDefinition(
                IntegratorSettingCreateObjectDefinitionParams.builder()
                    .appId(0)
                    .integratorObjectCreationRequest(
                        IntegratorObjectCreationRequest.builder()
                            .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                            .build()
                    )
                    .build()
            )

        bulkIntegratorObjectCreationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModel =
            integratorSettingService.createOembedDomain(
                IntegratorSettingCreateOembedDomainParams.builder()
                    .appId(0)
                    .integratorOEmbedDomainRequest(
                        IntegratorOEmbedDomainRequest.builder()
                            .endpoints(
                                Endpoints.builder()
                                    .discovery(true)
                                    .addScheme("string")
                                    .url("url")
                                    .build()
                            )
                            .portalId(0)
                            .build()
                    )
                    .build()
            )

        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        integratorSettingService.deleteOembedDomain(
            IntegratorSettingDeleteOembedDomainParams.builder()
                .appId(0)
                .id(0L)
                .domainPortalId(0)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val eventVisibilityResponse = integratorSettingService.getEventVisibilitySettings(0)

        eventVisibilityResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getObjectDefinitionsByMediaType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val objectDefinitionResponse =
            integratorSettingService.getObjectDefinitionsByMediaType(
                IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
                    .appId(0)
                    .mediaType(
                        IntegratorSettingGetObjectDefinitionsByMediaTypeParams.MediaType.AUDIO
                    )
                    .includeFullDefinition(true)
                    .build()
            )

        objectDefinitionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModel =
            integratorSettingService.getOembedDomain(
                IntegratorSettingGetOembedDomainParams.builder()
                    .appId(0)
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listOembedDomains() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val oEmbedDomainsCollectionResponse =
            integratorSettingService.listOembedDomains(
                IntegratorSettingListOembedDomainsParams.builder()
                    .appId(0)
                    .domainPortalId(0)
                    .build()
            )

        oEmbedDomainsCollectionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun registerAppName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val mediaBridgeProviderRegistrationResponse =
            integratorSettingService.registerAppName(
                IntegratorSettingRegisterAppNameParams.builder()
                    .appId(0)
                    .mediaBridgeProviderPartial(
                        MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()
                    )
                    .build()
            )

        mediaBridgeProviderRegistrationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAppName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val mediaBridgeProviderRegistrationResponse =
            integratorSettingService.updateAppName(
                IntegratorSettingUpdateAppNameParams.builder()
                    .appId(0)
                    .mediaBridgeProviderPartial(
                        MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()
                    )
                    .build()
            )

        mediaBridgeProviderRegistrationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateEventVisibilitySettings() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val eventVisibilityChange =
            integratorSettingService.updateEventVisibilitySettings(
                IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                    .appId(0)
                    .eventVisibilityChange(
                        EventVisibilityChange.builder()
                            .eventType(EventVisibilityChange.EventType.ALL)
                            .updatedAt(0L)
                            .showInReporting(true)
                            .showInTimeline(true)
                            .showInWorkflows(true)
                            .build()
                    )
                    .build()
            )

        eventVisibilityChange.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModel =
            integratorSettingService.updateOembedDomain(
                IntegratorSettingUpdateOembedDomainParams.builder()
                    .appId(0)
                    .oEmbedDomainId("oEmbedDomainId")
                    .integratorOEmbedDomainRequest(
                        IntegratorOEmbedDomainRequest.builder()
                            .endpoints(
                                Endpoints.builder()
                                    .discovery(true)
                                    .addScheme("string")
                                    .url("url")
                                    .build()
                            )
                            .portalId(0)
                            .build()
                    )
                    .build()
            )

        integratorOEmbedDomainModel.validate()
    }
}
