// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

        val bulkIntegratorObjectCreationResponseFuture =
            integratorSettingServiceAsync.createObjectDefinition(
                IntegratorSettingCreateObjectDefinitionParams.builder()
                    .appId(0)
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val integratorOEmbedDomainModelFuture =
            integratorSettingServiceAsync.createOembedDomain(
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

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
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

        val future =
            integratorSettingServiceAsync.deleteOembedDomain(
                IntegratorSettingDeleteOembedDomainParams.builder()
                    .appId(0)
                    .id(0L)
                    .domainPortalId(0)
                    .build()
            )

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

        val eventVisibilityResponseFuture =
            integratorSettingServiceAsync.getEventVisibilitySettings(0)

        val eventVisibilityResponse = eventVisibilityResponseFuture.get()
        eventVisibilityResponse.validate()
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

        val objectDefinitionResponseFuture =
            integratorSettingServiceAsync.getObjectDefinitionsByMediaType(
                IntegratorSettingGetObjectDefinitionsByMediaTypeParams.builder()
                    .appId(0)
                    .mediaType(
                        IntegratorSettingGetObjectDefinitionsByMediaTypeParams.MediaType.VIDEO
                    )
                    .includeFullDefinition(true)
                    .build()
            )

        val objectDefinitionResponse = objectDefinitionResponseFuture.get()
        objectDefinitionResponse.validate()
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

        val integratorOEmbedDomainModelFuture =
            integratorSettingServiceAsync.getOembedDomain(
                IntegratorSettingGetOembedDomainParams.builder()
                    .appId(0)
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val oEmbedDomainsCollectionResponseFuture =
            integratorSettingServiceAsync.listOembedDomains(
                IntegratorSettingListOembedDomainsParams.builder()
                    .appId(0)
                    .domainPortalId(0)
                    .build()
            )

        val oEmbedDomainsCollectionResponse = oEmbedDomainsCollectionResponseFuture.get()
        oEmbedDomainsCollectionResponse.validate()
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

        val mediaBridgeProviderRegistrationResponseFuture =
            integratorSettingServiceAsync.registerAppName(
                IntegratorSettingRegisterAppNameParams.builder()
                    .appId(0)
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val mediaBridgeProviderRegistrationResponseFuture =
            integratorSettingServiceAsync.updateAppName(
                IntegratorSettingUpdateAppNameParams.builder()
                    .appId(0)
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val integratorSettingServiceAsync = client.cms().mediaBridge().integratorSettings()

        val eventVisibilityChangeFuture =
            integratorSettingServiceAsync.updateEventVisibilitySettings(
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

        val eventVisibilityChange = eventVisibilityChangeFuture.get()
        eventVisibilityChange.validate()
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

        val integratorOEmbedDomainModelFuture =
            integratorSettingServiceAsync.updateOembedDomain(
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

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }
}
