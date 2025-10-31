// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class IntegratorSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createObjectDefinition() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.createObjectDefinition(
                IntegratorSettingCreateObjectDefinitionParams.builder()
                    .appId("appId")
                    .addMediaType(IntegratorSettingCreateObjectDefinitionParams.MediaType.VIDEO)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOembedDomain() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.createOembedDomain(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val future = integratorSettingServiceAsync.deleteOembedDomain("appId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture = integratorSettingServiceAsync.getEventVisibilitySettings("appId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getObjectDefinitionsByMediaType() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.getObjectDefinitionsByMediaType(
                IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
                    .appId("appId")
                    .mediaType("mediaType")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOembedDomain() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.getOembedDomain(
                IntegratorSettingGetOembedDomainParams.builder()
                    .appId("appId")
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listOembedDomains() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture = integratorSettingServiceAsync.listOembedDomains("appId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun registerAppName() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.registerAppName(
                IntegratorSettingRegisterAppNameParams.builder()
                    .appId("appId")
                    .updatedAt(0L)
                    .name("name")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAppName() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.updateAppName(
                IntegratorSettingUpdateAppNameParams.builder()
                    .appId("appId")
                    .updatedAt(0L)
                    .name("name")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateEventVisibilitySettings() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.updateEventVisibilitySettings(
                IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                    .appId("appId")
                    .eventType(IntegratorSettingUpdateEventVisibilitySettingsParams.EventType.ALL)
                    .updatedAt(0L)
                    .showInReporting(true)
                    .showInTimeline(true)
                    .showInWorkflows(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val responseFuture =
            integratorSettingServiceAsync.updateOembedDomain(
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

        val response = responseFuture.get()
        response.validate()
    }
}
