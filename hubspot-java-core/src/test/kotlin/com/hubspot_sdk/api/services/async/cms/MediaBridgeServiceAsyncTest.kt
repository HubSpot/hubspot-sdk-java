// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgePropertyUpdate
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderPartial
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaBridgeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAssociation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val associationDefinitionFuture =
            mediaBridgeServiceAsync.createAssociation(
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

        val associationDefinition = associationDefinitionFuture.get()
        associationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAttentionSpanEvent() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val attentionSpanEventFuture =
            mediaBridgeServiceAsync.createAttentionSpanEvent(
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

        val attentionSpanEvent = attentionSpanEventFuture.get()
        attentionSpanEvent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMediaPlayedEvent() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val mediaPlayedEventFuture =
            mediaBridgeServiceAsync.createMediaPlayedEvent(
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

        val mediaPlayedEvent = mediaPlayedEventFuture.get()
        mediaPlayedEvent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMediaPlayedPercentEvent() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val mediaPlayedPercentageEventFuture =
            mediaBridgeServiceAsync.createMediaPlayedPercentEvent(
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

        val mediaPlayedPercentageEvent = mediaPlayedPercentageEventFuture.get()
        mediaPlayedPercentageEvent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createObjectType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val bulkIntegratorObjectCreationResponseFuture =
            mediaBridgeServiceAsync.createObjectType(
                MediaBridgeCreateObjectTypeParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOembedDomain() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val integratorOEmbedDomainModelFuture =
            mediaBridgeServiceAsync.createOembedDomain(
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

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val propertyFuture =
            mediaBridgeServiceAsync.createProperty(
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

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createPropertyGroup() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val propertyGroupFuture =
            mediaBridgeServiceAsync.createPropertyGroup(
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

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createVideoAssociationDefinition() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val associationDefinitionFuture =
            mediaBridgeServiceAsync.createVideoAssociationDefinition(0)

        val associationDefinition = associationDefinitionFuture.get()
        associationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val future =
            mediaBridgeServiceAsync.deleteAssociation(
                MediaBridgeDeleteAssociationParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .associationId("associationId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteOembedDomain() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val future =
            mediaBridgeServiceAsync.deleteOembedDomain(
                MediaBridgeDeleteOembedDomainParams.builder()
                    .appId(0)
                    .id(0L)
                    .domainPortalId(0)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val future =
            mediaBridgeServiceAsync.deleteProperty(
                MediaBridgeDeletePropertyParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePropertyGroup() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val future =
            mediaBridgeServiceAsync.deletePropertyGroup(
                MediaBridgeDeletePropertyGroupParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventVisibilitySettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val eventVisibilityResponseFuture = mediaBridgeServiceAsync.getEventVisibilitySettings(0)

        val eventVisibilityResponse = eventVisibilityResponseFuture.get()
        eventVisibilityResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOembedDomain() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val integratorOEmbedDomainModelFuture =
            mediaBridgeServiceAsync.getOembedDomain(
                MediaBridgeGetOembedDomainParams.builder()
                    .appId(0)
                    .oEmbedDomainId("oEmbedDomainId")
                    .build()
            )

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val propertyFuture =
            mediaBridgeServiceAsync.getProperty(
                MediaBridgeGetPropertyParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPropertyGroup() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val propertyGroupFuture =
            mediaBridgeServiceAsync.getPropertyGroup(
                MediaBridgeGetPropertyGroupParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .groupName("groupName")
                    .build()
            )

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSchema() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val objectSchemaFuture =
            mediaBridgeServiceAsync.getSchema(
                MediaBridgeGetSchemaParams.builder().appId(0).objectType("objectType").build()
            )

        val objectSchema = objectSchemaFuture.get()
        objectSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listObjectTypesByMediaType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val objectDefinitionResponseFuture =
            mediaBridgeServiceAsync.listObjectTypesByMediaType(
                MediaBridgeListObjectTypesByMediaTypeParams.builder()
                    .appId(0)
                    .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
                    .includeFullDefinition(true)
                    .build()
            )

        val objectDefinitionResponse = objectDefinitionResponseFuture.get()
        objectDefinitionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listOembedDomains() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val oEmbedDomainsCollectionResponseFuture =
            mediaBridgeServiceAsync.listOembedDomains(
                MediaBridgeListOembedDomainsParams.builder().appId(0).domainPortalId(0).build()
            )

        val oEmbedDomainsCollectionResponse = oEmbedDomainsCollectionResponseFuture.get()
        oEmbedDomainsCollectionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProperties() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val collectionResponsePropertyNoPagingFuture =
            mediaBridgeServiceAsync.listProperties(
                MediaBridgeListPropertiesParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        val collectionResponsePropertyNoPaging = collectionResponsePropertyNoPagingFuture.get()
        collectionResponsePropertyNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPropertyGroups() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val collectionResponsePropertyGroupNoPagingFuture =
            mediaBridgeServiceAsync.listPropertyGroups(
                MediaBridgeListPropertyGroupsParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .build()
            )

        val collectionResponsePropertyGroupNoPaging =
            collectionResponsePropertyGroupNoPagingFuture.get()
        collectionResponsePropertyGroupNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSchemas() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val collectionResponseObjectSchemaNoPagingFuture =
            mediaBridgeServiceAsync.listSchemas(
                MediaBridgeListSchemasParams.builder().appId(0).archived(true).build()
            )

        val collectionResponseObjectSchemaNoPaging =
            collectionResponseObjectSchemaNoPagingFuture.get()
        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun registerAppName() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val mediaBridgeProviderRegistrationResponseFuture =
            mediaBridgeServiceAsync.registerAppName(
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

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeProviderRegistrationResponseFuture.get()
        mediaBridgeProviderRegistrationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventVisibilitySettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val eventVisibilityChangeFuture =
            mediaBridgeServiceAsync.updateEventVisibilitySettings(
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

        val eventVisibilityChange = eventVisibilityChangeFuture.get()
        eventVisibilityChange.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateOembedDomain() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val integratorOEmbedDomainModelFuture =
            mediaBridgeServiceAsync.updateOembedDomain(
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

        val integratorOEmbedDomainModel = integratorOEmbedDomainModelFuture.get()
        integratorOEmbedDomainModel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val propertyFuture =
            mediaBridgeServiceAsync.updateProperty(
                MediaBridgeUpdatePropertyParams.builder()
                    .appId(0)
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

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updatePropertyGroup() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val propertyGroupFuture =
            mediaBridgeServiceAsync.updatePropertyGroup(
                MediaBridgeUpdatePropertyGroupParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .groupName("groupName")
                    .propertyGroupUpdate(
                        PropertyGroupUpdate.builder().displayOrder(0).label("label").build()
                    )
                    .build()
            )

        val propertyGroup = propertyGroupFuture.get()
        propertyGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSchema() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val objectTypeDefinitionFuture =
            mediaBridgeServiceAsync.updateSchema(
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

        val objectTypeDefinition = objectTypeDefinitionFuture.get()
        objectTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val mediaBridgeServiceAsync = client.cms().mediaBridge()

        val mediaBridgeProviderRegistrationResponseFuture =
            mediaBridgeServiceAsync.updateSettings(
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

        val mediaBridgeProviderRegistrationResponse =
            mediaBridgeProviderRegistrationResponseFuture.get()
        mediaBridgeProviderRegistrationResponse.validate()
    }
}
