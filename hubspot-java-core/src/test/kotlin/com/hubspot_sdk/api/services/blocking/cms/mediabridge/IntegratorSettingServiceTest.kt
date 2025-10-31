// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainParams
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
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.createObjectDefinition(
                IntegratorSettingCreateObjectDefinitionParams.builder()
                    .appId("appId")
                    .addMediaType(IntegratorSettingCreateObjectDefinitionParams.MediaType.VIDEO)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.createOembedDomain(
                IntegratorSettingCreateOembedDomainParams.builder()
                    .appId("appId")
                    .endpoints(
                        IntegratorSettingCreateOembedDomainParams.Endpoints.builder()
                            .discovery(true)
                            .addScheme("string")
                            .url("url")
                            .build()
                    )
                    .portalId(0)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        integratorSettingService.deleteOembedDomain("appId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response = integratorSettingService.getEventVisibilitySettings("appId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getObjectDefinitionsByMediaType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.getObjectDefinitionsByMediaType(
                IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
                    .appId("appId")
                    .mediaType("mediaType")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.getOembedDomain(
                IntegratorSettingGetOembedDomainParams.builder()
                    .appId("appId")
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listOembedDomains() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response = integratorSettingService.listOembedDomains("appId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun registerAppName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.registerAppName(
                IntegratorSettingRegisterAppNameParams.builder()
                    .appId("appId")
                    .updatedAt(0L)
                    .name("name")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAppName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.updateAppName(
                IntegratorSettingUpdateAppNameParams.builder()
                    .appId("appId")
                    .updatedAt(0L)
                    .name("name")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateEventVisibilitySettings() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.updateEventVisibilitySettings(
                IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                    .appId("appId")
                    .eventType(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
                    .updatedAt(0L)
                    .showInReporting(true)
                    .showInTimeline(true)
                    .showInWorkflows(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingService = client.cms().mediaBridge().integratorSettings()

        val response =
            integratorSettingService.updateOembedDomain(
                IntegratorSettingUpdateOembedDomainParams.builder()
                    .appId("appId")
                    .oEmbedDomainId("oEmbedDomainId")
                    .endpoints(
                        IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                            .discovery(true)
                            .addScheme("string")
                            .url("url")
                            .build()
                    )
                    .portalId(0)
                    .build()
            )

        response.validate()
    }
}
