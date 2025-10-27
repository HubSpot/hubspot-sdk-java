// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.mediabridge.Endpoints
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityChange
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainRequest
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorObjectCreationRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderPartial
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val bulkIntegratorObjectCreationResponseFuture =
            integratorSettingServiceAsync.createObjectDefinition(
                IntegratorSettingCreateObjectDefinitionParams.builder()
                    .appId("appId")
                    .integratorObjectCreationRequest(
                        IntegratorObjectCreationRequest.builder()
                            .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                            .build()
                    )
                    .build()
            )

        val bulkIntegratorObjectCreationResponse = bulkIntegratorObjectCreationResponseFuture.get()
        bulkIntegratorObjectCreationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOembedDomain() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModelFuture =
            integratorSettingServiceAsync.createOembedDomain(
                IntegratorSettingCreateOembedDomainParams.builder()
                    .appId("appId")
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

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val future = integratorSettingServiceAsync.deleteOembedDomain("appId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val eventVisibilityResponseFuture =
            integratorSettingServiceAsync.getEventVisibilitySettings("appId")

        val eventVisibilityResponse = eventVisibilityResponseFuture.get()
        eventVisibilityResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getObjectDefinitionsByMediaType() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val objectDefinitionResponseFuture =
            integratorSettingServiceAsync.getObjectDefinitionsByMediaType(
                IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
                    .appId("appId")
                    .mediaType("mediaType")
                    .build()
            )

        val objectDefinitionResponse = objectDefinitionResponseFuture.get()
        objectDefinitionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOembedDomain() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModelFuture =
            integratorSettingServiceAsync.getOembedDomain(
                IntegratorSettingGetOembedDomainParams.builder()
                    .appId("appId")
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listOembedDomains() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val oEmbedDomainsCollectionResponseFuture =
            integratorSettingServiceAsync.listOembedDomains("appId")

        val oEmbedDomainsCollectionResponse = oEmbedDomainsCollectionResponseFuture.get()
        oEmbedDomainsCollectionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun registerAppName() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val mediaBridgeProviderRegistrationResponseFuture =
            integratorSettingServiceAsync.registerAppName(
                IntegratorSettingRegisterAppNameParams.builder()
                    .appId("appId")
                    .mediaBridgeProviderPartial(
                        MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()
                    )
                    .build()
            )

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeProviderRegistrationResponseFuture.get()
        mediaBridgeProviderRegistrationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAppName() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val mediaBridgeProviderRegistrationResponseFuture =
            integratorSettingServiceAsync.updateAppName(
                IntegratorSettingUpdateAppNameParams.builder()
                    .appId("appId")
                    .mediaBridgeProviderPartial(
                        MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()
                    )
                    .build()
            )

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeProviderRegistrationResponseFuture.get()
        mediaBridgeProviderRegistrationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateEventVisibilitySettings() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val eventVisibilityChangeFuture =
            integratorSettingServiceAsync.updateEventVisibilitySettings(
                IntegratorSettingUpdateEventVisibilitySettingsParams.builder()
                    .appId("appId")
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

        val eventVisibilityChange = eventVisibilityChangeFuture.get()
        eventVisibilityChange.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModelFuture =
            integratorSettingServiceAsync.updateOembedDomain(
                IntegratorSettingUpdateOembedDomainParams.builder()
                    .appId("appId")
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

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }
}
