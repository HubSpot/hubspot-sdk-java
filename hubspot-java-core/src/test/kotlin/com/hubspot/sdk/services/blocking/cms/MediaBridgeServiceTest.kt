// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.AssociationDefinitionEgg
import com.hubspot.sdk.models.ObjectTypeDefinitionLabels
import com.hubspot.sdk.models.ObjectTypeDefinitionPatch
import com.hubspot.sdk.models.OptionInput
import com.hubspot.sdk.models.PropertyCreate
import com.hubspot.sdk.models.PropertyGroupCreate
import com.hubspot.sdk.models.PropertyGroupUpdate
import com.hubspot.sdk.models.cms.mediabridge.AttentionSpanCalculatedValues
import com.hubspot.sdk.models.cms.mediabridge.AttentionSpanEventRequest
import com.hubspot.sdk.models.cms.mediabridge.Endpoints
import com.hubspot.sdk.models.cms.mediabridge.EventVisibilityChange
import com.hubspot.sdk.models.cms.mediabridge.IntegratorOEmbedDomainRequest
import com.hubspot.sdk.models.cms.mediabridge.IntegratorObjectCreationRequest
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateAssociationParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateObjectTypeParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreatePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreatePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeleteAssociationParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeleteOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgePropertyUpdate
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeProviderPartial
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaBridgeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAssociation() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val baseAssociationDefinition =
            mediaBridgeService.createAssociation(
                MediaBridgeCreateAssociationParams.builder()
                    .appId(0)
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

        baseAssociationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAttentionSpanEvent() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val attentionSpanEvent =
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

        attentionSpanEvent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMediaPlayedEvent() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaPlayedEvent =
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

        mediaPlayedEvent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMediaPlayedPercentEvent() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaPlayedPercentageEvent =
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

        mediaPlayedPercentageEvent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createObjectType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val bulkIntegratorObjectCreationResponse =
            mediaBridgeService.createObjectType(
                MediaBridgeCreateObjectTypeParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOembedDomain() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val integratorOEmbedDomainModel =
            mediaBridgeService.createOembedDomain(
                MediaBridgeCreateOembedDomainParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProperty =
            mediaBridgeService.createProperty(
                MediaBridgeCreatePropertyParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyCreate(
                        PropertyCreate.builder()
                            .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                            .groupName("groupName")
                            .label("label")
                            .name("name")
                            .type(PropertyCreate.Type.BOOL)
                            .calculationFormula("calculationFormula")
                            .currencyPropertyName("currencyPropertyName")
                            .dataSensitivity(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
                            .description("description")
                            .displayOrder(0)
                            .externalOptions(true)
                            .formField(true)
                            .hasUniqueValue(true)
                            .hidden(true)
                            .numberDisplayHint(PropertyCreate.NumberDisplayHint.CURRENCY)
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
                            .showCurrencySymbol(true)
                            .build()
                    )
                    .build()
            )

        mediaBridgeProperty.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createPropertyGroup() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val propertyGroup =
            mediaBridgeService.createPropertyGroup(
                MediaBridgeCreatePropertyGroupParams.builder()
                    .appId(0)
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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val baseAssociationDefinition = mediaBridgeService.createVideoAssociationDefinition(0)

        baseAssociationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociation() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deleteAssociation(
            MediaBridgeDeleteAssociationParams.builder()
                .appId(0)
                .objectType("objectType")
                .associationId("associationId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deleteOembedDomain(
            MediaBridgeDeleteOembedDomainParams.builder().appId(0).id(0L).domainPortalId(0).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deleteProperty(
            MediaBridgeDeletePropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePropertyGroup() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        mediaBridgeService.deletePropertyGroup(
            MediaBridgeDeletePropertyGroupParams.builder()
                .appId(0)
                .objectType("objectType")
                .groupName("groupName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val eventVisibilityResponse = mediaBridgeService.getEventVisibilitySettings(0)

        eventVisibilityResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOembedDomain() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val integratorOEmbedDomainModel =
            mediaBridgeService.getOembedDomain(
                MediaBridgeGetOembedDomainParams.builder()
                    .appId(0)
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProperty =
            mediaBridgeService.getProperty(
                MediaBridgeGetPropertyParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        mediaBridgeProperty.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPropertyGroup() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val propertyGroup =
            mediaBridgeService.getPropertyGroup(
                MediaBridgeGetPropertyGroupParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSchema() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val objectSchema =
            mediaBridgeService.getSchema(
                MediaBridgeGetSchemaParams.builder().appId(0).objectType("objectType").build()
            )

        objectSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listObjectTypesByMediaType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val objectDefinitionResponse =
            mediaBridgeService.listObjectTypesByMediaType(
                MediaBridgeListObjectTypesByMediaTypeParams.builder()
                    .appId(0)
                    .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
                    .includeFullDefinition(true)
                    .build()
            )

        objectDefinitionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listOembedDomains() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val oEmbedDomainsCollectionResponse =
            mediaBridgeService.listOembedDomains(
                MediaBridgeListOembedDomainsParams.builder().appId(0).domainPortalId(0).build()
            )

        oEmbedDomainsCollectionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProperties() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val collectionResponsePropertyNoPaging =
            mediaBridgeService.listProperties(
                MediaBridgeListPropertiesParams.builder()
                    .appId(0)
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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val collectionResponsePropertyGroupNoPaging =
            mediaBridgeService.listPropertyGroups(
                MediaBridgeListPropertyGroupsParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .build()
            )

        collectionResponsePropertyGroupNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSchemas() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val collectionResponseObjectSchemaNoPaging =
            mediaBridgeService.listSchemas(
                MediaBridgeListSchemasParams.builder().appId(0).archived(true).build()
            )

        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun registerAppName() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeService.registerAppName(
                MediaBridgeRegisterAppNameParams.builder()
                    .appId(0)
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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val eventVisibilityChange =
            mediaBridgeService.updateEventVisibilitySettings(
                MediaBridgeUpdateEventVisibilitySettingsParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val integratorOEmbedDomainModel =
            mediaBridgeService.updateOembedDomain(
                MediaBridgeUpdateOembedDomainParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProperty =
            mediaBridgeService.updateProperty(
                MediaBridgeUpdatePropertyParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .mediaBridgePropertyUpdate(
                        MediaBridgePropertyUpdate.builder()
                            .calculationFormula("calculationFormula")
                            .currencyPropertyName("currencyPropertyName")
                            .description("description")
                            .displayOrder(0)
                            .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
                            .formField(true)
                            .groupName("groupName")
                            .hasUniqueValue(true)
                            .hidden(true)
                            .label("label")
                            .numberDisplayHint(MediaBridgePropertyUpdate.NumberDisplayHint.CURRENCY)
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .showCurrencySymbol(true)
                            .type(MediaBridgePropertyUpdate.Type.BOOL)
                            .build()
                    )
                    .build()
            )

        mediaBridgeProperty.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updatePropertyGroup() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val propertyGroup =
            mediaBridgeService.updatePropertyGroup(
                MediaBridgeUpdatePropertyGroupParams.builder()
                    .appId(0)
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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val baseObjectTypeDefinition =
            mediaBridgeService.updateSchema(
                MediaBridgeUpdateSchemaParams.builder()
                    .appId(0)
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

        baseObjectTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val mediaBridgeService = client.cms().mediaBridge()

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeService.updateSettings(
                MediaBridgeUpdateSettingsParams.builder()
                    .appId(0)
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
