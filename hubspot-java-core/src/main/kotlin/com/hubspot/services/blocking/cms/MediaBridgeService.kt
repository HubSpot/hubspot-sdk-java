// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.AssociationDefinition
import com.hubspot.models.CollectionResponsePropertyGroupNoPaging
import com.hubspot.models.ObjectTypeDefinition
import com.hubspot.models.PropertyGroup
import com.hubspot.models.cms.mediabridge.AttentionSpanEvent
import com.hubspot.models.cms.mediabridge.AttentionSpanEventRequest
import com.hubspot.models.cms.mediabridge.BulkIntegratorObjectCreationResponse
import com.hubspot.models.cms.mediabridge.CollectionResponseObjectSchemaNoPaging
import com.hubspot.models.cms.mediabridge.CollectionResponsePropertyNoPaging
import com.hubspot.models.cms.mediabridge.EventVisibilityChange
import com.hubspot.models.cms.mediabridge.EventVisibilityResponse
import com.hubspot.models.cms.mediabridge.IntegratorOEmbedDomainModel
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateAssociationParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateAttentionSpanEventParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateMediaPlayedEventParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateMediaPlayedPercentEventParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateObjectTypeParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateOembedDomainParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreatePropertyGroupParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreatePropertyParams
import com.hubspot.models.cms.mediabridge.MediaBridgeCreateVideoAssociationDefinitionParams
import com.hubspot.models.cms.mediabridge.MediaBridgeDeleteAssociationParams
import com.hubspot.models.cms.mediabridge.MediaBridgeDeleteOembedDomainParams
import com.hubspot.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot.models.cms.mediabridge.MediaBridgeGetEventVisibilitySettingsParams
import com.hubspot.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot.models.cms.mediabridge.MediaBridgeProviderRegistrationResponse
import com.hubspot.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot.models.cms.mediabridge.MediaPlayedEvent
import com.hubspot.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot.models.cms.mediabridge.MediaPlayedPercentageEvent
import com.hubspot.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import com.hubspot.models.cms.mediabridge.OEmbedDomainsCollectionResponse
import com.hubspot.models.cms.mediabridge.ObjectDefinitionResponse
import com.hubspot.models.cms.mediabridge.ObjectSchema
import com.hubspot.models.cms.mediabridge.Property
import com.hubspot.services.blocking.cms.mediabridge.BatchService
import java.util.function.Consumer

interface MediaBridgeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeService

    fun batch(): BatchService

    /** Create a new association definition for the specified object type. */
    fun createAssociation(
        objectType: String,
        params: MediaBridgeCreateAssociationParams,
    ): AssociationDefinition = createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(params: MediaBridgeCreateAssociationParams): AssociationDefinition =
        createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition

    /** Create an event containing the viewers attention span details for the media. */
    fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams
    ): AttentionSpanEvent = createAttentionSpanEvent(params, RequestOptions.none())

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttentionSpanEvent

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttentionSpanEvent =
        createAttentionSpanEvent(
            MediaBridgeCreateAttentionSpanEventParams.builder()
                .attentionSpanEventRequest(attentionSpanEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest
    ): AttentionSpanEvent =
        createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

    /** Create an event for when a user begins playing a piece of media. */
    fun createMediaPlayedEvent(params: MediaBridgeCreateMediaPlayedEventParams): MediaPlayedEvent =
        createMediaPlayedEvent(params, RequestOptions.none())

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        params: MediaBridgeCreateMediaPlayedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedEvent

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        mediaPlayedEventRequest: MediaPlayedEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedEvent =
        createMediaPlayedEvent(
            MediaBridgeCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(mediaPlayedEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(mediaPlayedEventRequest: MediaPlayedEventRequest): MediaPlayedEvent =
        createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

    /**
     * Create an event representing a user reaching quarterly milestones in a piece of media they're
     * viewing.
     */
    fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams
    ): MediaPlayedPercentageEvent = createMediaPlayedPercentEvent(params, RequestOptions.none())

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedPercentageEvent

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedPercentageEvent =
        createMediaPlayedPercentEvent(
            MediaBridgeCreateMediaPlayedPercentEventParams.builder()
                .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
    ): MediaPlayedPercentageEvent =
        createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())

    /** Create a new media object type */
    fun createObjectType(
        appId: Int,
        params: MediaBridgeCreateObjectTypeParams,
    ): BulkIntegratorObjectCreationResponse = createObjectType(appId, params, RequestOptions.none())

    /** @see createObjectType */
    fun createObjectType(
        appId: Int,
        params: MediaBridgeCreateObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkIntegratorObjectCreationResponse =
        createObjectType(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createObjectType */
    fun createObjectType(
        params: MediaBridgeCreateObjectTypeParams
    ): BulkIntegratorObjectCreationResponse = createObjectType(params, RequestOptions.none())

    /** @see createObjectType */
    fun createObjectType(
        params: MediaBridgeCreateObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkIntegratorObjectCreationResponse

    /** Set up a new oEmbed domain for your media bridge app. */
    fun createOembedDomain(
        appId: Int,
        params: MediaBridgeCreateOembedDomainParams,
    ): IntegratorOEmbedDomainModel = createOembedDomain(appId, params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        appId: Int,
        params: MediaBridgeCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorOEmbedDomainModel =
        createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: MediaBridgeCreateOembedDomainParams
    ): IntegratorOEmbedDomainModel = createOembedDomain(params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: MediaBridgeCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorOEmbedDomainModel

    /** Create a new property for the specified media type */
    fun createProperty(objectType: String, params: MediaBridgeCreatePropertyParams): Property =
        createProperty(objectType, params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        objectType: String,
        params: MediaBridgeCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = createProperty(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createProperty */
    fun createProperty(params: MediaBridgeCreatePropertyParams): Property =
        createProperty(params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        params: MediaBridgeCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Create a new property group for the specified object type. */
    fun createPropertyGroup(
        objectType: String,
        params: MediaBridgeCreatePropertyGroupParams,
    ): PropertyGroup = createPropertyGroup(objectType, params, RequestOptions.none())

    /** @see createPropertyGroup */
    fun createPropertyGroup(
        objectType: String,
        params: MediaBridgeCreatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup =
        createPropertyGroup(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createPropertyGroup */
    fun createPropertyGroup(params: MediaBridgeCreatePropertyGroupParams): PropertyGroup =
        createPropertyGroup(params, RequestOptions.none())

    /** @see createPropertyGroup */
    fun createPropertyGroup(
        params: MediaBridgeCreatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    fun createVideoAssociationDefinition(appId: Int): AssociationDefinition =
        createVideoAssociationDefinition(
            appId,
            MediaBridgeCreateVideoAssociationDefinitionParams.none(),
        )

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        appId: Int,
        params: MediaBridgeCreateVideoAssociationDefinitionParams =
            MediaBridgeCreateVideoAssociationDefinitionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition =
        createVideoAssociationDefinition(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        appId: Int,
        params: MediaBridgeCreateVideoAssociationDefinitionParams =
            MediaBridgeCreateVideoAssociationDefinitionParams.none(),
    ): AssociationDefinition =
        createVideoAssociationDefinition(appId, params, RequestOptions.none())

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        params: MediaBridgeCreateVideoAssociationDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        params: MediaBridgeCreateVideoAssociationDefinitionParams
    ): AssociationDefinition = createVideoAssociationDefinition(params, RequestOptions.none())

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        appId: Int,
        requestOptions: RequestOptions,
    ): AssociationDefinition =
        createVideoAssociationDefinition(
            appId,
            MediaBridgeCreateVideoAssociationDefinitionParams.none(),
            requestOptions,
        )

    /** Delete an existing association definition for an object type. */
    fun deleteAssociation(associationId: String, params: MediaBridgeDeleteAssociationParams) =
        deleteAssociation(associationId, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationId: String,
        params: MediaBridgeDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAssociation(params.toBuilder().associationId(associationId).build(), requestOptions)

    /** @see deleteAssociation */
    fun deleteAssociation(params: MediaBridgeDeleteAssociationParams) =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: MediaBridgeDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete an existing oEmbed domain. */
    fun deleteOembedDomain(appId: Int) =
        deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: Int,
        params: MediaBridgeDeleteOembedDomainParams = MediaBridgeDeleteOembedDomainParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: Int,
        params: MediaBridgeDeleteOembedDomainParams = MediaBridgeDeleteOembedDomainParams.none(),
    ) = deleteOembedDomain(appId, params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: MediaBridgeDeleteOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(params: MediaBridgeDeleteOembedDomainParams) =
        deleteOembedDomain(params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(appId: Int, requestOptions: RequestOptions) =
        deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none(), requestOptions)

    /** Delete an existing property for an object type. */
    fun deleteProperty(propertyName: String, params: MediaBridgeDeletePropertyParams) =
        deleteProperty(propertyName, params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        propertyName: String,
        params: MediaBridgeDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see deleteProperty */
    fun deleteProperty(params: MediaBridgeDeletePropertyParams) =
        deleteProperty(params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        params: MediaBridgeDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete an existing property group by name */
    fun deletePropertyGroup(groupName: String, params: MediaBridgeDeletePropertyGroupParams) =
        deletePropertyGroup(groupName, params, RequestOptions.none())

    /** @see deletePropertyGroup */
    fun deletePropertyGroup(
        groupName: String,
        params: MediaBridgeDeletePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deletePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see deletePropertyGroup */
    fun deletePropertyGroup(params: MediaBridgeDeletePropertyGroupParams) =
        deletePropertyGroup(params, RequestOptions.none())

    /** @see deletePropertyGroup */
    fun deletePropertyGroup(
        params: MediaBridgeDeletePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the visibility settings for media bridge events for your apps. */
    fun getEventVisibilitySettings(appId: Int): EventVisibilityResponse =
        getEventVisibilitySettings(appId, MediaBridgeGetEventVisibilitySettingsParams.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeGetEventVisibilitySettingsParams =
            MediaBridgeGetEventVisibilitySettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventVisibilityResponse =
        getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeGetEventVisibilitySettingsParams =
            MediaBridgeGetEventVisibilitySettingsParams.none(),
    ): EventVisibilityResponse = getEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: MediaBridgeGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventVisibilityResponse

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: MediaBridgeGetEventVisibilitySettingsParams
    ): EventVisibilityResponse = getEventVisibilitySettings(params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): EventVisibilityResponse =
        getEventVisibilitySettings(
            appId,
            MediaBridgeGetEventVisibilitySettingsParams.none(),
            requestOptions,
        )

    /** Get the details for an existing oEmbed domain. */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeGetOembedDomainParams,
    ): IntegratorOEmbedDomainModel = getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorOEmbedDomainModel =
        getOembedDomain(params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(), requestOptions)

    /** @see getOembedDomain */
    fun getOembedDomain(params: MediaBridgeGetOembedDomainParams): IntegratorOEmbedDomainModel =
        getOembedDomain(params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: MediaBridgeGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorOEmbedDomainModel

    /** Get the details for an existing property by name. */
    fun getProperty(propertyName: String, params: MediaBridgeGetPropertyParams): Property =
        getProperty(propertyName, params, RequestOptions.none())

    /** @see getProperty */
    fun getProperty(
        propertyName: String,
        params: MediaBridgeGetPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = getProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see getProperty */
    fun getProperty(params: MediaBridgeGetPropertyParams): Property =
        getProperty(params, RequestOptions.none())

    /** @see getProperty */
    fun getProperty(
        params: MediaBridgeGetPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Get the details of an existing property group by name. */
    fun getPropertyGroup(
        groupName: String,
        params: MediaBridgeGetPropertyGroupParams,
    ): PropertyGroup = getPropertyGroup(groupName, params, RequestOptions.none())

    /** @see getPropertyGroup */
    fun getPropertyGroup(
        groupName: String,
        params: MediaBridgeGetPropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup =
        getPropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see getPropertyGroup */
    fun getPropertyGroup(params: MediaBridgeGetPropertyGroupParams): PropertyGroup =
        getPropertyGroup(params, RequestOptions.none())

    /** @see getPropertyGroup */
    fun getPropertyGroup(
        params: MediaBridgeGetPropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** Get the schema for a specified object type. */
    fun getSchema(objectType: String, params: MediaBridgeGetSchemaParams): ObjectSchema =
        getSchema(objectType, params, RequestOptions.none())

    /** @see getSchema */
    fun getSchema(
        objectType: String,
        params: MediaBridgeGetSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema = getSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see getSchema */
    fun getSchema(params: MediaBridgeGetSchemaParams): ObjectSchema =
        getSchema(params, RequestOptions.none())

    /** @see getSchema */
    fun getSchema(
        params: MediaBridgeGetSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** Get the existing objects types that belong to the specified media type. */
    fun listObjectTypesByMediaType(
        mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
        params: MediaBridgeListObjectTypesByMediaTypeParams,
    ): ObjectDefinitionResponse =
        listObjectTypesByMediaType(mediaType, params, RequestOptions.none())

    /** @see listObjectTypesByMediaType */
    fun listObjectTypesByMediaType(
        mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
        params: MediaBridgeListObjectTypesByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectDefinitionResponse =
        listObjectTypesByMediaType(params.toBuilder().mediaType(mediaType).build(), requestOptions)

    /** @see listObjectTypesByMediaType */
    fun listObjectTypesByMediaType(
        params: MediaBridgeListObjectTypesByMediaTypeParams
    ): ObjectDefinitionResponse = listObjectTypesByMediaType(params, RequestOptions.none())

    /** @see listObjectTypesByMediaType */
    fun listObjectTypesByMediaType(
        params: MediaBridgeListObjectTypesByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectDefinitionResponse

    /** Get the details for existing oEmbed domains for your app */
    fun listOembedDomains(appId: Int): OEmbedDomainsCollectionResponse =
        listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OEmbedDomainsCollectionResponse =
        listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
    ): OEmbedDomainsCollectionResponse = listOembedDomains(appId, params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: MediaBridgeListOembedDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OEmbedDomainsCollectionResponse

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: MediaBridgeListOembedDomainsParams
    ): OEmbedDomainsCollectionResponse = listOembedDomains(params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        requestOptions: RequestOptions,
    ): OEmbedDomainsCollectionResponse =
        listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none(), requestOptions)

    /** Get the existing properties defined for a media object type. */
    fun listProperties(
        objectType: String,
        params: MediaBridgeListPropertiesParams,
    ): CollectionResponsePropertyNoPaging =
        listProperties(objectType, params, RequestOptions.none())

    /** @see listProperties */
    fun listProperties(
        objectType: String,
        params: MediaBridgeListPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyNoPaging =
        listProperties(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see listProperties */
    fun listProperties(
        params: MediaBridgeListPropertiesParams
    ): CollectionResponsePropertyNoPaging = listProperties(params, RequestOptions.none())

    /** @see listProperties */
    fun listProperties(
        params: MediaBridgeListPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyNoPaging

    /** Get the property groups for a specified object type. */
    fun listPropertyGroups(
        objectType: String,
        params: MediaBridgeListPropertyGroupsParams,
    ): CollectionResponsePropertyGroupNoPaging =
        listPropertyGroups(objectType, params, RequestOptions.none())

    /** @see listPropertyGroups */
    fun listPropertyGroups(
        objectType: String,
        params: MediaBridgeListPropertyGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyGroupNoPaging =
        listPropertyGroups(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see listPropertyGroups */
    fun listPropertyGroups(
        params: MediaBridgeListPropertyGroupsParams
    ): CollectionResponsePropertyGroupNoPaging = listPropertyGroups(params, RequestOptions.none())

    /** @see listPropertyGroups */
    fun listPropertyGroups(
        params: MediaBridgeListPropertyGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyGroupNoPaging

    /** Get the schemas for all object types. */
    fun listSchemas(appId: Int): CollectionResponseObjectSchemaNoPaging =
        listSchemas(appId, MediaBridgeListSchemasParams.none())

    /** @see listSchemas */
    fun listSchemas(
        appId: Int,
        params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging =
        listSchemas(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSchemas */
    fun listSchemas(
        appId: Int,
        params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
    ): CollectionResponseObjectSchemaNoPaging = listSchemas(appId, params, RequestOptions.none())

    /** @see listSchemas */
    fun listSchemas(
        params: MediaBridgeListSchemasParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging

    /** @see listSchemas */
    fun listSchemas(params: MediaBridgeListSchemasParams): CollectionResponseObjectSchemaNoPaging =
        listSchemas(params, RequestOptions.none())

    /** @see listSchemas */
    fun listSchemas(
        appId: Int,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectSchemaNoPaging =
        listSchemas(appId, MediaBridgeListSchemasParams.none(), requestOptions)

    /** Register the name that your app will display when a user is selecting media bridge items. */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: Int,
        params: MediaBridgeRegisterAppNameParams,
    ): MediaBridgeProviderRegistrationResponse =
        registerAppName(appId, params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: Int,
        params: MediaBridgeRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaBridgeProviderRegistrationResponse =
        registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: MediaBridgeRegisterAppNameParams
    ): MediaBridgeProviderRegistrationResponse = registerAppName(params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: MediaBridgeRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaBridgeProviderRegistrationResponse

    /** Set the visibility settings for media bridge events created by your app. */
    fun updateEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
    ): EventVisibilityChange = updateEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventVisibilityChange =
        updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: MediaBridgeUpdateEventVisibilitySettingsParams
    ): EventVisibilityChange = updateEventVisibilitySettings(params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventVisibilityChange

    /** Update an existing oEmbed domain. */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeUpdateOembedDomainParams,
    ): IntegratorOEmbedDomainModel =
        updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorOEmbedDomainModel =
        updateOembedDomain(
            params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
            requestOptions,
        )

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: MediaBridgeUpdateOembedDomainParams
    ): IntegratorOEmbedDomainModel = updateOembedDomain(params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: MediaBridgeUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorOEmbedDomainModel

    /** Update an existing property for an object type. */
    fun updateProperty(propertyName: String, params: MediaBridgeUpdatePropertyParams): Property =
        updateProperty(propertyName, params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        propertyName: String,
        params: MediaBridgeUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property =
        updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see updateProperty */
    fun updateProperty(params: MediaBridgeUpdatePropertyParams): Property =
        updateProperty(params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        params: MediaBridgeUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Update an existing property group by name. */
    fun updatePropertyGroup(
        groupName: String,
        params: MediaBridgeUpdatePropertyGroupParams,
    ): PropertyGroup = updatePropertyGroup(groupName, params, RequestOptions.none())

    /** @see updatePropertyGroup */
    fun updatePropertyGroup(
        groupName: String,
        params: MediaBridgeUpdatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup =
        updatePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see updatePropertyGroup */
    fun updatePropertyGroup(params: MediaBridgeUpdatePropertyGroupParams): PropertyGroup =
        updatePropertyGroup(params, RequestOptions.none())

    /** @see updatePropertyGroup */
    fun updatePropertyGroup(
        params: MediaBridgeUpdatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** Update the schema for an existing object type */
    fun updateSchema(
        objectType: String,
        params: MediaBridgeUpdateSchemaParams,
    ): ObjectTypeDefinition = updateSchema(objectType, params, RequestOptions.none())

    /** @see updateSchema */
    fun updateSchema(
        objectType: String,
        params: MediaBridgeUpdateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeDefinition =
        updateSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see updateSchema */
    fun updateSchema(params: MediaBridgeUpdateSchemaParams): ObjectTypeDefinition =
        updateSchema(params, RequestOptions.none())

    /** @see updateSchema */
    fun updateSchema(
        params: MediaBridgeUpdateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeDefinition

    /** Update the name that your app will display when a user is selecting media bridge items. */
    fun updateSettings(
        appId: Int,
        params: MediaBridgeUpdateSettingsParams,
    ): MediaBridgeProviderRegistrationResponse =
        updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: MediaBridgeUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaBridgeProviderRegistrationResponse =
        updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(
        params: MediaBridgeUpdateSettingsParams
    ): MediaBridgeProviderRegistrationResponse = updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: MediaBridgeUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaBridgeProviderRegistrationResponse

    /**
     * A view of [MediaBridgeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/schemas/{objectType}/associations`, but is otherwise the
         * same as [MediaBridgeService.createAssociation].
         */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: MediaBridgeCreateAssociationParams,
        ): HttpResponseFor<AssociationDefinition> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: MediaBridgeCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: MediaBridgeCreateAssociationParams
        ): HttpResponseFor<AssociationDefinition> = createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: MediaBridgeCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition>

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/events/attention-span`, but
         * is otherwise the same as [MediaBridgeService.createAttentionSpanEvent].
         */
        @MustBeClosed
        fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams
        ): HttpResponseFor<AttentionSpanEvent> =
            createAttentionSpanEvent(params, RequestOptions.none())

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttentionSpanEvent>

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttentionSpanEvent> =
            createAttentionSpanEvent(
                MediaBridgeCreateAttentionSpanEventParams.builder()
                    .attentionSpanEventRequest(attentionSpanEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest
        ): HttpResponseFor<AttentionSpanEvent> =
            createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/events/media-played`, but is
         * otherwise the same as [MediaBridgeService.createMediaPlayedEvent].
         */
        @MustBeClosed
        fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams
        ): HttpResponseFor<MediaPlayedEvent> = createMediaPlayedEvent(params, RequestOptions.none())

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedEvent>

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedEvent> =
            createMediaPlayedEvent(
                MediaBridgeCreateMediaPlayedEventParams.builder()
                    .mediaPlayedEventRequest(mediaPlayedEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest
        ): HttpResponseFor<MediaPlayedEvent> =
            createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/events/media-played-percent`,
         * but is otherwise the same as [MediaBridgeService.createMediaPlayedPercentEvent].
         */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams
        ): HttpResponseFor<MediaPlayedPercentageEvent> =
            createMediaPlayedPercentEvent(params, RequestOptions.none())

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedPercentageEvent>

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedPercentageEvent> =
            createMediaPlayedPercentEvent(
                MediaBridgeCreateMediaPlayedPercentEventParams.builder()
                    .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
        ): HttpResponseFor<MediaPlayedPercentageEvent> =
            createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/settings/object-definitions`, but is otherwise the same as
         * [MediaBridgeService.createObjectType].
         */
        @MustBeClosed
        fun createObjectType(
            appId: Int,
            params: MediaBridgeCreateObjectTypeParams,
        ): HttpResponseFor<BulkIntegratorObjectCreationResponse> =
            createObjectType(appId, params, RequestOptions.none())

        /** @see createObjectType */
        @MustBeClosed
        fun createObjectType(
            appId: Int,
            params: MediaBridgeCreateObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkIntegratorObjectCreationResponse> =
            createObjectType(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createObjectType */
        @MustBeClosed
        fun createObjectType(
            params: MediaBridgeCreateObjectTypeParams
        ): HttpResponseFor<BulkIntegratorObjectCreationResponse> =
            createObjectType(params, RequestOptions.none())

        /** @see createObjectType */
        @MustBeClosed
        fun createObjectType(
            params: MediaBridgeCreateObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkIntegratorObjectCreationResponse>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [MediaBridgeService.createOembedDomain].
         */
        @MustBeClosed
        fun createOembedDomain(
            appId: Int,
            params: MediaBridgeCreateOembedDomainParams,
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            createOembedDomain(appId, params, RequestOptions.none())

        /** @see createOembedDomain */
        @MustBeClosed
        fun createOembedDomain(
            appId: Int,
            params: MediaBridgeCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOembedDomain */
        @MustBeClosed
        fun createOembedDomain(
            params: MediaBridgeCreateOembedDomainParams
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            createOembedDomain(params, RequestOptions.none())

        /** @see createOembedDomain */
        @MustBeClosed
        fun createOembedDomain(
            params: MediaBridgeCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorOEmbedDomainModel>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}`, but is otherwise the same as
         * [MediaBridgeService.createProperty].
         */
        @MustBeClosed
        fun createProperty(
            objectType: String,
            params: MediaBridgeCreatePropertyParams,
        ): HttpResponseFor<Property> = createProperty(objectType, params, RequestOptions.none())

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(
            objectType: String,
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            createProperty(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(params: MediaBridgeCreatePropertyParams): HttpResponseFor<Property> =
            createProperty(params, RequestOptions.none())

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups`, but is otherwise the same
         * as [MediaBridgeService.createPropertyGroup].
         */
        @MustBeClosed
        fun createPropertyGroup(
            objectType: String,
            params: MediaBridgeCreatePropertyGroupParams,
        ): HttpResponseFor<PropertyGroup> =
            createPropertyGroup(objectType, params, RequestOptions.none())

        /** @see createPropertyGroup */
        @MustBeClosed
        fun createPropertyGroup(
            objectType: String,
            params: MediaBridgeCreatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            createPropertyGroup(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createPropertyGroup */
        @MustBeClosed
        fun createPropertyGroup(
            params: MediaBridgeCreatePropertyGroupParams
        ): HttpResponseFor<PropertyGroup> = createPropertyGroup(params, RequestOptions.none())

        /** @see createPropertyGroup */
        @MustBeClosed
        fun createPropertyGroup(
            params: MediaBridgeCreatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/settings/video-association-definition`, but is otherwise
         * the same as [MediaBridgeService.createVideoAssociationDefinition].
         */
        @MustBeClosed
        fun createVideoAssociationDefinition(appId: Int): HttpResponseFor<AssociationDefinition> =
            createVideoAssociationDefinition(
                appId,
                MediaBridgeCreateVideoAssociationDefinitionParams.none(),
            )

        /** @see createVideoAssociationDefinition */
        @MustBeClosed
        fun createVideoAssociationDefinition(
            appId: Int,
            params: MediaBridgeCreateVideoAssociationDefinitionParams =
                MediaBridgeCreateVideoAssociationDefinitionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition> =
            createVideoAssociationDefinition(
                params.toBuilder().appId(appId).build(),
                requestOptions,
            )

        /** @see createVideoAssociationDefinition */
        @MustBeClosed
        fun createVideoAssociationDefinition(
            appId: Int,
            params: MediaBridgeCreateVideoAssociationDefinitionParams =
                MediaBridgeCreateVideoAssociationDefinitionParams.none(),
        ): HttpResponseFor<AssociationDefinition> =
            createVideoAssociationDefinition(appId, params, RequestOptions.none())

        /** @see createVideoAssociationDefinition */
        @MustBeClosed
        fun createVideoAssociationDefinition(
            params: MediaBridgeCreateVideoAssociationDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition>

        /** @see createVideoAssociationDefinition */
        @MustBeClosed
        fun createVideoAssociationDefinition(
            params: MediaBridgeCreateVideoAssociationDefinitionParams
        ): HttpResponseFor<AssociationDefinition> =
            createVideoAssociationDefinition(params, RequestOptions.none())

        /** @see createVideoAssociationDefinition */
        @MustBeClosed
        fun createVideoAssociationDefinition(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociationDefinition> =
            createVideoAssociationDefinition(
                appId,
                MediaBridgeCreateVideoAssociationDefinitionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/schemas/{objectType}/associations/{associationId}`, but is
         * otherwise the same as [MediaBridgeService.deleteAssociation].
         */
        @MustBeClosed
        fun deleteAssociation(
            associationId: String,
            params: MediaBridgeDeleteAssociationParams,
        ): HttpResponse = deleteAssociation(associationId, params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            associationId: String,
            params: MediaBridgeDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAssociation(
                params.toBuilder().associationId(associationId).build(),
                requestOptions,
            )

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(params: MediaBridgeDeleteAssociationParams): HttpResponse =
            deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            params: MediaBridgeDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [MediaBridgeService.deleteOembedDomain].
         */
        @MustBeClosed
        fun deleteOembedDomain(appId: Int): HttpResponse =
            deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none())

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(
            appId: Int,
            params: MediaBridgeDeleteOembedDomainParams =
                MediaBridgeDeleteOembedDomainParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(
            appId: Int,
            params: MediaBridgeDeleteOembedDomainParams = MediaBridgeDeleteOembedDomainParams.none(),
        ): HttpResponse = deleteOembedDomain(appId, params, RequestOptions.none())

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(
            params: MediaBridgeDeleteOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(params: MediaBridgeDeleteOembedDomainParams): HttpResponse =
            deleteOembedDomain(params, RequestOptions.none())

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(appId: Int, requestOptions: RequestOptions): HttpResponse =
            deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}`, but is otherwise
         * the same as [MediaBridgeService.deleteProperty].
         */
        @MustBeClosed
        fun deleteProperty(
            propertyName: String,
            params: MediaBridgeDeletePropertyParams,
        ): HttpResponse = deleteProperty(propertyName, params, RequestOptions.none())

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(
            propertyName: String,
            params: MediaBridgeDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(params: MediaBridgeDeletePropertyParams): HttpResponse =
            deleteProperty(params, RequestOptions.none())

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(
            params: MediaBridgeDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}`, but is
         * otherwise the same as [MediaBridgeService.deletePropertyGroup].
         */
        @MustBeClosed
        fun deletePropertyGroup(
            groupName: String,
            params: MediaBridgeDeletePropertyGroupParams,
        ): HttpResponse = deletePropertyGroup(groupName, params, RequestOptions.none())

        /** @see deletePropertyGroup */
        @MustBeClosed
        fun deletePropertyGroup(
            groupName: String,
            params: MediaBridgeDeletePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deletePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see deletePropertyGroup */
        @MustBeClosed
        fun deletePropertyGroup(params: MediaBridgeDeletePropertyGroupParams): HttpResponse =
            deletePropertyGroup(params, RequestOptions.none())

        /** @see deletePropertyGroup */
        @MustBeClosed
        fun deletePropertyGroup(
            params: MediaBridgeDeletePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/event-visibility`, but is otherwise the same as
         * [MediaBridgeService.getEventVisibilitySettings].
         */
        @MustBeClosed
        fun getEventVisibilitySettings(appId: Int): HttpResponseFor<EventVisibilityResponse> =
            getEventVisibilitySettings(appId, MediaBridgeGetEventVisibilitySettingsParams.none())

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeGetEventVisibilitySettingsParams =
                MediaBridgeGetEventVisibilitySettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventVisibilityResponse> =
            getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeGetEventVisibilitySettingsParams =
                MediaBridgeGetEventVisibilitySettingsParams.none(),
        ): HttpResponseFor<EventVisibilityResponse> =
            getEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            params: MediaBridgeGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventVisibilityResponse>

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            params: MediaBridgeGetEventVisibilitySettingsParams
        ): HttpResponseFor<EventVisibilityResponse> =
            getEventVisibilitySettings(params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventVisibilityResponse> =
            getEventVisibilitySettings(
                appId,
                MediaBridgeGetEventVisibilitySettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise
         * the same as [MediaBridgeService.getOembedDomain].
         */
        @MustBeClosed
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeGetOembedDomainParams,
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see getOembedDomain */
        @MustBeClosed
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            getOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see getOembedDomain */
        @MustBeClosed
        fun getOembedDomain(
            params: MediaBridgeGetOembedDomainParams
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            getOembedDomain(params, RequestOptions.none())

        /** @see getOembedDomain */
        @MustBeClosed
        fun getOembedDomain(
            params: MediaBridgeGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorOEmbedDomainModel>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}`, but is otherwise
         * the same as [MediaBridgeService.getProperty].
         */
        @MustBeClosed
        fun getProperty(
            propertyName: String,
            params: MediaBridgeGetPropertyParams,
        ): HttpResponseFor<Property> = getProperty(propertyName, params, RequestOptions.none())

        /** @see getProperty */
        @MustBeClosed
        fun getProperty(
            propertyName: String,
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            getProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see getProperty */
        @MustBeClosed
        fun getProperty(params: MediaBridgeGetPropertyParams): HttpResponseFor<Property> =
            getProperty(params, RequestOptions.none())

        /** @see getProperty */
        @MustBeClosed
        fun getProperty(
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}`, but is
         * otherwise the same as [MediaBridgeService.getPropertyGroup].
         */
        @MustBeClosed
        fun getPropertyGroup(
            groupName: String,
            params: MediaBridgeGetPropertyGroupParams,
        ): HttpResponseFor<PropertyGroup> =
            getPropertyGroup(groupName, params, RequestOptions.none())

        /** @see getPropertyGroup */
        @MustBeClosed
        fun getPropertyGroup(
            groupName: String,
            params: MediaBridgeGetPropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            getPropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see getPropertyGroup */
        @MustBeClosed
        fun getPropertyGroup(
            params: MediaBridgeGetPropertyGroupParams
        ): HttpResponseFor<PropertyGroup> = getPropertyGroup(params, RequestOptions.none())

        /** @see getPropertyGroup */
        @MustBeClosed
        fun getPropertyGroup(
            params: MediaBridgeGetPropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `get /media-bridge/2026-03/{appId}/schemas/{objectType}`,
         * but is otherwise the same as [MediaBridgeService.getSchema].
         */
        @MustBeClosed
        fun getSchema(
            objectType: String,
            params: MediaBridgeGetSchemaParams,
        ): HttpResponseFor<ObjectSchema> = getSchema(objectType, params, RequestOptions.none())

        /** @see getSchema */
        @MustBeClosed
        fun getSchema(
            objectType: String,
            params: MediaBridgeGetSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            getSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see getSchema */
        @MustBeClosed
        fun getSchema(params: MediaBridgeGetSchemaParams): HttpResponseFor<ObjectSchema> =
            getSchema(params, RequestOptions.none())

        /** @see getSchema */
        @MustBeClosed
        fun getSchema(
            params: MediaBridgeGetSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/object-definitions/{mediaType}`, but is otherwise
         * the same as [MediaBridgeService.listObjectTypesByMediaType].
         */
        @MustBeClosed
        fun listObjectTypesByMediaType(
            mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
            params: MediaBridgeListObjectTypesByMediaTypeParams,
        ): HttpResponseFor<ObjectDefinitionResponse> =
            listObjectTypesByMediaType(mediaType, params, RequestOptions.none())

        /** @see listObjectTypesByMediaType */
        @MustBeClosed
        fun listObjectTypesByMediaType(
            mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
            params: MediaBridgeListObjectTypesByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectDefinitionResponse> =
            listObjectTypesByMediaType(
                params.toBuilder().mediaType(mediaType).build(),
                requestOptions,
            )

        /** @see listObjectTypesByMediaType */
        @MustBeClosed
        fun listObjectTypesByMediaType(
            params: MediaBridgeListObjectTypesByMediaTypeParams
        ): HttpResponseFor<ObjectDefinitionResponse> =
            listObjectTypesByMediaType(params, RequestOptions.none())

        /** @see listObjectTypesByMediaType */
        @MustBeClosed
        fun listObjectTypesByMediaType(
            params: MediaBridgeListObjectTypesByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectDefinitionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [MediaBridgeService.listOembedDomains].
         */
        @MustBeClosed
        fun listOembedDomains(appId: Int): HttpResponseFor<OEmbedDomainsCollectionResponse> =
            listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none())

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            appId: Int,
            params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OEmbedDomainsCollectionResponse> =
            listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            appId: Int,
            params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
        ): HttpResponseFor<OEmbedDomainsCollectionResponse> =
            listOembedDomains(appId, params, RequestOptions.none())

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            params: MediaBridgeListOembedDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OEmbedDomainsCollectionResponse>

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            params: MediaBridgeListOembedDomainsParams
        ): HttpResponseFor<OEmbedDomainsCollectionResponse> =
            listOembedDomains(params, RequestOptions.none())

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OEmbedDomainsCollectionResponse> =
            listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}`, but is otherwise the same as
         * [MediaBridgeService.listProperties].
         */
        @MustBeClosed
        fun listProperties(
            objectType: String,
            params: MediaBridgeListPropertiesParams,
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            listProperties(objectType, params, RequestOptions.none())

        /** @see listProperties */
        @MustBeClosed
        fun listProperties(
            objectType: String,
            params: MediaBridgeListPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            listProperties(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see listProperties */
        @MustBeClosed
        fun listProperties(
            params: MediaBridgeListPropertiesParams
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            listProperties(params, RequestOptions.none())

        /** @see listProperties */
        @MustBeClosed
        fun listProperties(
            params: MediaBridgeListPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups`, but is otherwise the same
         * as [MediaBridgeService.listPropertyGroups].
         */
        @MustBeClosed
        fun listPropertyGroups(
            objectType: String,
            params: MediaBridgeListPropertyGroupsParams,
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            listPropertyGroups(objectType, params, RequestOptions.none())

        /** @see listPropertyGroups */
        @MustBeClosed
        fun listPropertyGroups(
            objectType: String,
            params: MediaBridgeListPropertyGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            listPropertyGroups(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see listPropertyGroups */
        @MustBeClosed
        fun listPropertyGroups(
            params: MediaBridgeListPropertyGroupsParams
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            listPropertyGroups(params, RequestOptions.none())

        /** @see listPropertyGroups */
        @MustBeClosed
        fun listPropertyGroups(
            params: MediaBridgeListPropertyGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging>

        /**
         * Returns a raw HTTP response for `get /media-bridge/2026-03/{appId}/schemas`, but is
         * otherwise the same as [MediaBridgeService.listSchemas].
         */
        @MustBeClosed
        fun listSchemas(appId: Int): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            listSchemas(appId, MediaBridgeListSchemasParams.none())

        /** @see listSchemas */
        @MustBeClosed
        fun listSchemas(
            appId: Int,
            params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            listSchemas(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSchemas */
        @MustBeClosed
        fun listSchemas(
            appId: Int,
            params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            listSchemas(appId, params, RequestOptions.none())

        /** @see listSchemas */
        @MustBeClosed
        fun listSchemas(
            params: MediaBridgeListSchemasParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging>

        /** @see listSchemas */
        @MustBeClosed
        fun listSchemas(
            params: MediaBridgeListSchemasParams
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            listSchemas(params, RequestOptions.none())

        /** @see listSchemas */
        @MustBeClosed
        fun listSchemas(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            listSchemas(appId, MediaBridgeListSchemasParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/{appId}/settings/register`,
         * but is otherwise the same as [MediaBridgeService.registerAppName].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            appId: Int,
            params: MediaBridgeRegisterAppNameParams,
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> =
            registerAppName(appId, params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            appId: Int,
            params: MediaBridgeRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> =
            registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see registerAppName */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            params: MediaBridgeRegisterAppNameParams
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> =
            registerAppName(params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            params: MediaBridgeRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/settings/event-visibility`, but is otherwise the same as
         * [MediaBridgeService.updateEventVisibilitySettings].
         */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
        ): HttpResponseFor<EventVisibilityChange> =
            updateEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventVisibilityChange> =
            updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateEventVisibilitySettings */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            params: MediaBridgeUpdateEventVisibilitySettingsParams
        ): HttpResponseFor<EventVisibilityChange> =
            updateEventVisibilitySettings(params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventVisibilityChange>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise
         * the same as [MediaBridgeService.updateOembedDomain].
         */
        @MustBeClosed
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeUpdateOembedDomainParams,
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see updateOembedDomain */
        @MustBeClosed
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            updateOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see updateOembedDomain */
        @MustBeClosed
        fun updateOembedDomain(
            params: MediaBridgeUpdateOembedDomainParams
        ): HttpResponseFor<IntegratorOEmbedDomainModel> =
            updateOembedDomain(params, RequestOptions.none())

        /** @see updateOembedDomain */
        @MustBeClosed
        fun updateOembedDomain(
            params: MediaBridgeUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorOEmbedDomainModel>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}`, but is otherwise
         * the same as [MediaBridgeService.updateProperty].
         */
        @MustBeClosed
        fun updateProperty(
            propertyName: String,
            params: MediaBridgeUpdatePropertyParams,
        ): HttpResponseFor<Property> = updateProperty(propertyName, params, RequestOptions.none())

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(
            propertyName: String,
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(params: MediaBridgeUpdatePropertyParams): HttpResponseFor<Property> =
            updateProperty(params, RequestOptions.none())

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}`, but is
         * otherwise the same as [MediaBridgeService.updatePropertyGroup].
         */
        @MustBeClosed
        fun updatePropertyGroup(
            groupName: String,
            params: MediaBridgeUpdatePropertyGroupParams,
        ): HttpResponseFor<PropertyGroup> =
            updatePropertyGroup(groupName, params, RequestOptions.none())

        /** @see updatePropertyGroup */
        @MustBeClosed
        fun updatePropertyGroup(
            groupName: String,
            params: MediaBridgeUpdatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            updatePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see updatePropertyGroup */
        @MustBeClosed
        fun updatePropertyGroup(
            params: MediaBridgeUpdatePropertyGroupParams
        ): HttpResponseFor<PropertyGroup> = updatePropertyGroup(params, RequestOptions.none())

        /** @see updatePropertyGroup */
        @MustBeClosed
        fun updatePropertyGroup(
            params: MediaBridgeUpdatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/schemas/{objectType}`, but is otherwise the same as
         * [MediaBridgeService.updateSchema].
         */
        @MustBeClosed
        fun updateSchema(
            objectType: String,
            params: MediaBridgeUpdateSchemaParams,
        ): HttpResponseFor<ObjectTypeDefinition> =
            updateSchema(objectType, params, RequestOptions.none())

        /** @see updateSchema */
        @MustBeClosed
        fun updateSchema(
            objectType: String,
            params: MediaBridgeUpdateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeDefinition> =
            updateSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see updateSchema */
        @MustBeClosed
        fun updateSchema(
            params: MediaBridgeUpdateSchemaParams
        ): HttpResponseFor<ObjectTypeDefinition> = updateSchema(params, RequestOptions.none())

        /** @see updateSchema */
        @MustBeClosed
        fun updateSchema(
            params: MediaBridgeUpdateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeDefinition>

        /**
         * Returns a raw HTTP response for `put /media-bridge/2026-03/{appId}/settings`, but is
         * otherwise the same as [MediaBridgeService.updateSettings].
         */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: MediaBridgeUpdateSettingsParams,
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> =
            updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: MediaBridgeUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: MediaBridgeUpdateSettingsParams
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: MediaBridgeUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse>
    }
}
