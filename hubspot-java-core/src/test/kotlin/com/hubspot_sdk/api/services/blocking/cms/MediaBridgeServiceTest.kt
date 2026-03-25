// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AssociationDefinitionEgg
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.ObjectTypeDefinitionPatch
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.PropertyCreate
import com.hubspot_sdk.api.models.PropertyGroupCreate
import com.hubspot_sdk.api.models.PropertyGroupUpdate
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanCalculatedValues
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.CreateVideoObjectRequest
import com.hubspot_sdk.api.models.cms.mediabridge.Endpoints
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityChange
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainRequest
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorObjectCreationRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateObjectTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreatePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreatePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeleteAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeleteOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgePropertyUpdate
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderPartial
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.UpdateVideoObjectRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class MediaBridgeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeObject =
            mediaBridgeService.create(
                CreateVideoObjectRequest.builder()
                    .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                    .title("title")
                    .bearerToken("bearerToken")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .transcriptUrl("transcriptUrl")
                    .build()
            )

        mediaBridgeObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeObject =
            mediaBridgeService.update(
                MediaBridgeUpdateParams.builder()
                    .objectId(0L)
                    .updateMbObjectRequest(
                        UpdateVideoObjectRequest.builder()
                            .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                            .bearerToken("bearerToken")
                            .detailsPageLink("detailsPageLink")
                            .duration(0L)
                            .externalId("externalId")
                            .fileUrl("fileUrl")
                            .oembedUrl("oembedUrl")
                            .posterUrl("posterUrl")
                            .thumbnailUrl("thumbnailUrl")
                            .title("title")
                            .transcriptUrl("transcriptUrl")
                            .build()
                    )
                    .build()
            )

        mediaBridgeObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val page = mediaBridgeService.list(MediaBridgeListParams.MediaType.AUDIO)

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.delete(
            MediaBridgeDeleteParams.builder()
                .mediaType(MediaBridgeDeleteParams.MediaType.AUDIO)
                .objectId(0L)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAssociation() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val associationDefinition =
            mediaBridgeService.createAssociation(
                MediaBridgeCreateAssociationParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .associationDefinitionEgg(
                        AssociationDefinitionEgg.builder()
                            .fromObjectTypeId("fromObjectTypeId")
                            .toObjectTypeId("toObjectTypeId")
                            .name("name")
                            .build()
                    )
                    .build()
            )

        associationDefinition.validate()
    }

    @Test
    fun createAttentionSpanEvent(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val mediaBridgeService = client.cms().mediaBridge()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            mediaBridgeService.createAttentionSpanEvent(
                AttentionSpanEventRequest.builder()
                    .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .rawDataMap(
                        AttentionSpanEventRequest.RawDataMap.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .derivedValues(
                        AttentionSpanCalculatedValues.builder()
                            .totalPercentPlayed(0.0)
                            .totalSecondsPlayed(0)
                            .build()
                    )
                    .externalId("externalId")
                    .externalPlayContext(AttentionSpanEventRequest.ExternalPlayContext.EMAIL)
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .rawDataString("rawDataString")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun createMediaPlayedEvent(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val mediaBridgeService = client.cms().mediaBridge()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            mediaBridgeService.createMediaPlayedEvent(
                MediaPlayedEventRequest.builder()
                    .mediaType(MediaPlayedEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .sessionId("sessionId")
                    .state(MediaPlayedEventRequest.State.STARTED)
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
                    .externalPlayContext(MediaPlayedEventRequest.ExternalPlayContext.EMAIL)
                    .iframeUrl("iframeUrl")
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun createMediaPlayedPercentEvent(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val mediaBridgeService = client.cms().mediaBridge()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            mediaBridgeService.createMediaPlayedPercentEvent(
                MediaPlayedPercentageEventRequest.builder()
                    .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .playedPercent(0)
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
                    .externalPlayContext(
                        MediaPlayedPercentageEventRequest.ExternalPlayContext.EMAIL
                    )
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createObjectType() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val bulkIntegratorObjectCreationResponse =
            mediaBridgeService.createObjectType(
                MediaBridgeCreateObjectTypeParams.builder()
                    .appId("appId")
                    .integratorObjectCreationRequest(
                        IntegratorObjectCreationRequest.builder()
                            .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                            .build()
                    )
                    .build()
            )

        bulkIntegratorObjectCreationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOembedDomain() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val integratorOEmbedDomainModel =
            mediaBridgeService.createOembedDomain(
                MediaBridgeCreateOembedDomainParams.builder()
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

        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val property =
            mediaBridgeService.createProperty(
                MediaBridgeCreatePropertyParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .propertyCreate(
                        PropertyCreate.builder()
                            .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                            .groupName("groupName")
                            .label("label")
                            .name("name")
                            .type(PropertyCreate.Type.BOOL)
                            .calculationFormula("calculationFormula")
                            .dataSensitivity(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
                            .description("description")
                            .displayOrder(0)
                            .externalOptions(true)
                            .formField(true)
                            .hasUniqueValue(true)
                            .hidden(true)
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .referencedObjectType("referencedObjectType")
                            .build()
                    )
                    .build()
            )

        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createPropertyGroup() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val propertyGroup =
            mediaBridgeService.createPropertyGroup(
                MediaBridgeCreatePropertyGroupParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .propertyGroupCreate(
                        PropertyGroupCreate.builder()
                            .label("label")
                            .name("name")
                            .displayOrder(0)
                            .build()
                    )
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createVideoAssociationDefinition() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val associationDefinition = mediaBridgeService.createVideoAssociationDefinition("appId")

        associationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociation() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deleteAssociation(
            MediaBridgeDeleteAssociationParams.builder()
                .appId("appId")
                .objectType("objectType")
                .associationId("associationId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deleteOembedDomain(
            MediaBridgeDeleteOembedDomainParams.builder()
                .appId("appId")
                .id(0L)
                .domainPortalId(0)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deleteProperty(
            MediaBridgeDeletePropertyParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePropertyGroup() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deletePropertyGroup(
            MediaBridgeDeletePropertyGroupParams.builder()
                .appId("appId")
                .objectType("objectType")
                .groupName("groupName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeObject =
            mediaBridgeService.get(
                MediaBridgeGetParams.builder()
                    .mediaType(MediaBridgeGetParams.MediaType.AUDIO)
                    .objectId(0L)
                    .build()
            )

        mediaBridgeObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val eventVisibilityResponse = mediaBridgeService.getEventVisibilitySettings("appId")

        eventVisibilityResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOembedDomain() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val integratorOEmbedDomainModel =
            mediaBridgeService.getOembedDomain(
                MediaBridgeGetOembedDomainParams.builder()
                    .appId("appId")
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val property =
            mediaBridgeService.getProperty(
                MediaBridgeGetPropertyParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPropertyGroup() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val propertyGroup =
            mediaBridgeService.getPropertyGroup(
                MediaBridgeGetPropertyGroupParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSchema() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val objectSchema =
            mediaBridgeService.getSchema(
                MediaBridgeGetSchemaParams.builder().appId("appId").objectType("objectType").build()
            )

        objectSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listObjectTypesByMediaType() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val objectDefinitionResponse =
            mediaBridgeService.listObjectTypesByMediaType(
                MediaBridgeListObjectTypesByMediaTypeParams.builder()
                    .appId("appId")
                    .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
                    .includeFullDefinition(true)
                    .build()
            )

        objectDefinitionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listOembedDomains() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val oEmbedDomainsCollectionResponse =
            mediaBridgeService.listOembedDomains(
                MediaBridgeListOembedDomainsParams.builder()
                    .appId("appId")
                    .domainPortalId(0)
                    .build()
            )

        oEmbedDomainsCollectionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProperties() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val collectionResponsePropertyNoPaging =
            mediaBridgeService.listProperties(
                MediaBridgeListPropertiesParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        collectionResponsePropertyNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPropertyGroups() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val collectionResponsePropertyGroupNoPaging =
            mediaBridgeService.listPropertyGroups(
                MediaBridgeListPropertyGroupsParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .build()
            )

        collectionResponsePropertyGroupNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSchemas() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val collectionResponseObjectSchemaNoPaging =
            mediaBridgeService.listSchemas(
                MediaBridgeListSchemasParams.builder().appId("appId").archived(true).build()
            )

        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun registerAppName() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeService.registerAppName(
                MediaBridgeRegisterAppNameParams.builder()
                    .appId("appId")
                    .mediaBridgeProviderPartial(
                        MediaBridgeProviderPartial.builder()
                            .updatedAt(0L)
                            .allowImportOnDisconnect(true)
                            .moduleName("moduleName")
                            .name("name")
                            .build()
                    )
                    .build()
            )

        mediaBridgeProviderRegistrationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventVisibilitySettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val eventVisibilityChange =
            mediaBridgeService.updateEventVisibilitySettings(
                MediaBridgeUpdateEventVisibilitySettingsParams.builder()
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

        eventVisibilityChange.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val integratorOEmbedDomainModel =
            mediaBridgeService.updateOembedDomain(
                MediaBridgeUpdateOembedDomainParams.builder()
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

        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val property =
            mediaBridgeService.updateProperty(
                MediaBridgeUpdatePropertyParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .mediaBridgePropertyUpdate(
                        MediaBridgePropertyUpdate.builder()
                            .calculationFormula("calculationFormula")
                            .description("description")
                            .displayOrder(0)
                            .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
                            .formField(true)
                            .groupName("groupName")
                            .hasUniqueValue(true)
                            .hidden(true)
                            .label("label")
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .type(MediaBridgePropertyUpdate.Type.BOOL)
                            .build()
                    )
                    .build()
            )

        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updatePropertyGroup() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val propertyGroup =
            mediaBridgeService.updatePropertyGroup(
                MediaBridgeUpdatePropertyGroupParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .groupName("groupName")
                    .propertyGroupUpdate(
                        PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
                    )
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSchema() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val objectTypeDefinition =
            mediaBridgeService.updateSchema(
                MediaBridgeUpdateSchemaParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .objectTypeDefinitionPatch(
                        ObjectTypeDefinitionPatch.builder()
                            .clearDescription(true)
                            .allowsSensitiveProperties(true)
                            .description("description")
                            .labels(
                                ObjectTypeDefinitionLabels.builder()
                                    .plural("plural")
                                    .singular("singular")
                                    .build()
                            )
                            .primaryDisplayProperty("primaryDisplayProperty")
                            .addRequiredProperty("string")
                            .restorable(true)
                            .addSearchableProperty("string")
                            .addSecondaryDisplayProperty("string")
                            .build()
                    )
                    .build()
            )

        objectTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeService.updateSettings(
                MediaBridgeUpdateSettingsParams.builder()
                    .appId("appId")
                    .mediaBridgeProviderPartial(
                        MediaBridgeProviderPartial.builder()
                            .updatedAt(0L)
                            .allowImportOnDisconnect(true)
                            .moduleName("moduleName")
                            .name("name")
                            .build()
                    )
                    .build()
            )

        mediaBridgeProviderRegistrationResponse.validate()
    }
}
