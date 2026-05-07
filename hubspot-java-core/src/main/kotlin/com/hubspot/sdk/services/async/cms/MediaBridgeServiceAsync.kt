// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AssociationDefinition
import com.hubspot.sdk.models.CollectionResponsePropertyGroupNoPaging
import com.hubspot.sdk.models.ObjectTypeDefinition
import com.hubspot.sdk.models.PropertyGroup
import com.hubspot.sdk.models.cms.mediabridge.AttentionSpanEvent
import com.hubspot.sdk.models.cms.mediabridge.AttentionSpanEventRequest
import com.hubspot.sdk.models.cms.mediabridge.BulkIntegratorObjectCreationResponse
import com.hubspot.sdk.models.cms.mediabridge.CollectionResponseObjectSchemaNoPaging
import com.hubspot.sdk.models.cms.mediabridge.CollectionResponsePropertyNoPaging
import com.hubspot.sdk.models.cms.mediabridge.EventVisibilityChange
import com.hubspot.sdk.models.cms.mediabridge.EventVisibilityResponse
import com.hubspot.sdk.models.cms.mediabridge.IntegratorOEmbedDomainModel
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateAssociationParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateAttentionSpanEventParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateMediaPlayedEventParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateMediaPlayedPercentEventParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateObjectTypeParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreatePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreatePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateVideoAssociationDefinitionParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeleteAssociationParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeleteOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetEventVisibilitySettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeProperty
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeProviderRegistrationResponse
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedEvent
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedPercentageEvent
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import com.hubspot.sdk.models.cms.mediabridge.OEmbedDomainsCollectionResponse
import com.hubspot.sdk.models.cms.mediabridge.ObjectDefinitionResponse
import com.hubspot.sdk.models.cms.mediabridge.ObjectSchema
import com.hubspot.sdk.services.async.cms.mediabridge.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MediaBridgeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a new association definition for the specified object type. */
    fun createAssociation(
        objectType: String,
        params: MediaBridgeCreateAssociationParams,
    ): CompletableFuture<AssociationDefinition> =
        createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationDefinition> =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(
        params: MediaBridgeCreateAssociationParams
    ): CompletableFuture<AssociationDefinition> = createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationDefinition>

    /** Create an event containing the viewers attention span details for the media. */
    fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams
    ): CompletableFuture<AttentionSpanEvent> =
        createAttentionSpanEvent(params, RequestOptions.none())

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttentionSpanEvent>

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttentionSpanEvent> =
        createAttentionSpanEvent(
            MediaBridgeCreateAttentionSpanEventParams.builder()
                .attentionSpanEventRequest(attentionSpanEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest
    ): CompletableFuture<AttentionSpanEvent> =
        createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

    /** Create an event for when a user begins playing a piece of media. */
    fun createMediaPlayedEvent(
        params: MediaBridgeCreateMediaPlayedEventParams
    ): CompletableFuture<MediaPlayedEvent> = createMediaPlayedEvent(params, RequestOptions.none())

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        params: MediaBridgeCreateMediaPlayedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedEvent>

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        mediaPlayedEventRequest: MediaPlayedEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedEvent> =
        createMediaPlayedEvent(
            MediaBridgeCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(mediaPlayedEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        mediaPlayedEventRequest: MediaPlayedEventRequest
    ): CompletableFuture<MediaPlayedEvent> =
        createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

    /**
     * Create an event representing a user reaching quarterly milestones in a piece of media they're
     * viewing.
     */
    fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        createMediaPlayedPercentEvent(params, RequestOptions.none())

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedPercentageEvent>

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        createMediaPlayedPercentEvent(
            MediaBridgeCreateMediaPlayedPercentEventParams.builder()
                .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())

    /** Create a new media object type */
    fun createObjectType(
        appId: Int,
        params: MediaBridgeCreateObjectTypeParams,
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        createObjectType(appId, params, RequestOptions.none())

    /** @see createObjectType */
    fun createObjectType(
        appId: Int,
        params: MediaBridgeCreateObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        createObjectType(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createObjectType */
    fun createObjectType(
        params: MediaBridgeCreateObjectTypeParams
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        createObjectType(params, RequestOptions.none())

    /** @see createObjectType */
    fun createObjectType(
        params: MediaBridgeCreateObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkIntegratorObjectCreationResponse>

    /** Set up a new oEmbed domain for your media bridge app. */
    fun createOembedDomain(
        appId: Int,
        params: MediaBridgeCreateOembedDomainParams,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        createOembedDomain(appId, params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        appId: Int,
        params: MediaBridgeCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: MediaBridgeCreateOembedDomainParams
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        createOembedDomain(params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: MediaBridgeCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel>

    /** Create a new property for the specified media type */
    fun createProperty(
        objectType: String,
        params: MediaBridgeCreatePropertyParams,
    ): CompletableFuture<MediaBridgeProperty> =
        createProperty(objectType, params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        objectType: String,
        params: MediaBridgeCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProperty> =
        createProperty(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createProperty */
    fun createProperty(
        params: MediaBridgeCreatePropertyParams
    ): CompletableFuture<MediaBridgeProperty> = createProperty(params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        params: MediaBridgeCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProperty>

    /** Create a new property group for the specified object type. */
    fun createPropertyGroup(
        objectType: String,
        params: MediaBridgeCreatePropertyGroupParams,
    ): CompletableFuture<PropertyGroup> =
        createPropertyGroup(objectType, params, RequestOptions.none())

    /** @see createPropertyGroup */
    fun createPropertyGroup(
        objectType: String,
        params: MediaBridgeCreatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        createPropertyGroup(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createPropertyGroup */
    fun createPropertyGroup(
        params: MediaBridgeCreatePropertyGroupParams
    ): CompletableFuture<PropertyGroup> = createPropertyGroup(params, RequestOptions.none())

    /** @see createPropertyGroup */
    fun createPropertyGroup(
        params: MediaBridgeCreatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    fun createVideoAssociationDefinition(appId: Int): CompletableFuture<AssociationDefinition> =
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
    ): CompletableFuture<AssociationDefinition> =
        createVideoAssociationDefinition(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        appId: Int,
        params: MediaBridgeCreateVideoAssociationDefinitionParams =
            MediaBridgeCreateVideoAssociationDefinitionParams.none(),
    ): CompletableFuture<AssociationDefinition> =
        createVideoAssociationDefinition(appId, params, RequestOptions.none())

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        params: MediaBridgeCreateVideoAssociationDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationDefinition>

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        params: MediaBridgeCreateVideoAssociationDefinitionParams
    ): CompletableFuture<AssociationDefinition> =
        createVideoAssociationDefinition(params, RequestOptions.none())

    /** @see createVideoAssociationDefinition */
    fun createVideoAssociationDefinition(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationDefinition> =
        createVideoAssociationDefinition(
            appId,
            MediaBridgeCreateVideoAssociationDefinitionParams.none(),
            requestOptions,
        )

    /** Delete an existing association definition for an object type. */
    fun deleteAssociation(
        associationId: String,
        params: MediaBridgeDeleteAssociationParams,
    ): CompletableFuture<Void?> = deleteAssociation(associationId, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationId: String,
        params: MediaBridgeDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAssociation(params.toBuilder().associationId(associationId).build(), requestOptions)

    /** @see deleteAssociation */
    fun deleteAssociation(params: MediaBridgeDeleteAssociationParams): CompletableFuture<Void?> =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: MediaBridgeDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete an existing oEmbed domain. */
    fun deleteOembedDomain(appId: Int): CompletableFuture<Void?> =
        deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: Int,
        params: MediaBridgeDeleteOembedDomainParams = MediaBridgeDeleteOembedDomainParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: Int,
        params: MediaBridgeDeleteOembedDomainParams = MediaBridgeDeleteOembedDomainParams.none(),
    ): CompletableFuture<Void?> = deleteOembedDomain(appId, params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: MediaBridgeDeleteOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(params: MediaBridgeDeleteOembedDomainParams): CompletableFuture<Void?> =
        deleteOembedDomain(params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none(), requestOptions)

    /** Delete an existing property for an object type. */
    fun deleteProperty(
        propertyName: String,
        params: MediaBridgeDeletePropertyParams,
    ): CompletableFuture<Void?> = deleteProperty(propertyName, params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        propertyName: String,
        params: MediaBridgeDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see deleteProperty */
    fun deleteProperty(params: MediaBridgeDeletePropertyParams): CompletableFuture<Void?> =
        deleteProperty(params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        params: MediaBridgeDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete an existing property group by name */
    fun deletePropertyGroup(
        groupName: String,
        params: MediaBridgeDeletePropertyGroupParams,
    ): CompletableFuture<Void?> = deletePropertyGroup(groupName, params, RequestOptions.none())

    /** @see deletePropertyGroup */
    fun deletePropertyGroup(
        groupName: String,
        params: MediaBridgeDeletePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deletePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see deletePropertyGroup */
    fun deletePropertyGroup(
        params: MediaBridgeDeletePropertyGroupParams
    ): CompletableFuture<Void?> = deletePropertyGroup(params, RequestOptions.none())

    /** @see deletePropertyGroup */
    fun deletePropertyGroup(
        params: MediaBridgeDeletePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the visibility settings for media bridge events for your apps. */
    fun getEventVisibilitySettings(appId: Int): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(appId, MediaBridgeGetEventVisibilitySettingsParams.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeGetEventVisibilitySettingsParams =
            MediaBridgeGetEventVisibilitySettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeGetEventVisibilitySettingsParams =
            MediaBridgeGetEventVisibilitySettingsParams.none(),
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: MediaBridgeGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityResponse>

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: MediaBridgeGetEventVisibilitySettingsParams
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(
            appId,
            MediaBridgeGetEventVisibilitySettingsParams.none(),
            requestOptions,
        )

    /** Get the details for an existing oEmbed domain. */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeGetOembedDomainParams,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        getOembedDomain(params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(), requestOptions)

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: MediaBridgeGetOembedDomainParams
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        getOembedDomain(params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: MediaBridgeGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel>

    /** Get the details for an existing property by name. */
    fun getProperty(
        propertyName: String,
        params: MediaBridgeGetPropertyParams,
    ): CompletableFuture<MediaBridgeProperty> =
        getProperty(propertyName, params, RequestOptions.none())

    /** @see getProperty */
    fun getProperty(
        propertyName: String,
        params: MediaBridgeGetPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProperty> =
        getProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see getProperty */
    fun getProperty(params: MediaBridgeGetPropertyParams): CompletableFuture<MediaBridgeProperty> =
        getProperty(params, RequestOptions.none())

    /** @see getProperty */
    fun getProperty(
        params: MediaBridgeGetPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProperty>

    /** Get the details of an existing property group by name. */
    fun getPropertyGroup(
        groupName: String,
        params: MediaBridgeGetPropertyGroupParams,
    ): CompletableFuture<PropertyGroup> = getPropertyGroup(groupName, params, RequestOptions.none())

    /** @see getPropertyGroup */
    fun getPropertyGroup(
        groupName: String,
        params: MediaBridgeGetPropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        getPropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see getPropertyGroup */
    fun getPropertyGroup(
        params: MediaBridgeGetPropertyGroupParams
    ): CompletableFuture<PropertyGroup> = getPropertyGroup(params, RequestOptions.none())

    /** @see getPropertyGroup */
    fun getPropertyGroup(
        params: MediaBridgeGetPropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    /** Get the schema for a specified object type. */
    fun getSchema(
        objectType: String,
        params: MediaBridgeGetSchemaParams,
    ): CompletableFuture<ObjectSchema> = getSchema(objectType, params, RequestOptions.none())

    /** @see getSchema */
    fun getSchema(
        objectType: String,
        params: MediaBridgeGetSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        getSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see getSchema */
    fun getSchema(params: MediaBridgeGetSchemaParams): CompletableFuture<ObjectSchema> =
        getSchema(params, RequestOptions.none())

    /** @see getSchema */
    fun getSchema(
        params: MediaBridgeGetSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

    /** Get the existing objects types that belong to the specified media type. */
    fun listObjectTypesByMediaType(
        mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
        params: MediaBridgeListObjectTypesByMediaTypeParams,
    ): CompletableFuture<ObjectDefinitionResponse> =
        listObjectTypesByMediaType(mediaType, params, RequestOptions.none())

    /** @see listObjectTypesByMediaType */
    fun listObjectTypesByMediaType(
        mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
        params: MediaBridgeListObjectTypesByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectDefinitionResponse> =
        listObjectTypesByMediaType(params.toBuilder().mediaType(mediaType).build(), requestOptions)

    /** @see listObjectTypesByMediaType */
    fun listObjectTypesByMediaType(
        params: MediaBridgeListObjectTypesByMediaTypeParams
    ): CompletableFuture<ObjectDefinitionResponse> =
        listObjectTypesByMediaType(params, RequestOptions.none())

    /** @see listObjectTypesByMediaType */
    fun listObjectTypesByMediaType(
        params: MediaBridgeListObjectTypesByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectDefinitionResponse>

    /** Get the details for existing oEmbed domains for your app */
    fun listOembedDomains(appId: Int): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(appId, params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: MediaBridgeListOembedDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OEmbedDomainsCollectionResponse>

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: MediaBridgeListOembedDomainsParams
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none(), requestOptions)

    /** Get the existing properties defined for a media object type. */
    fun listProperties(
        objectType: String,
        params: MediaBridgeListPropertiesParams,
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        listProperties(objectType, params, RequestOptions.none())

    /** @see listProperties */
    fun listProperties(
        objectType: String,
        params: MediaBridgeListPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        listProperties(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see listProperties */
    fun listProperties(
        params: MediaBridgeListPropertiesParams
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        listProperties(params, RequestOptions.none())

    /** @see listProperties */
    fun listProperties(
        params: MediaBridgeListPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging>

    /** Get the property groups for a specified object type. */
    fun listPropertyGroups(
        objectType: String,
        params: MediaBridgeListPropertyGroupsParams,
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        listPropertyGroups(objectType, params, RequestOptions.none())

    /** @see listPropertyGroups */
    fun listPropertyGroups(
        objectType: String,
        params: MediaBridgeListPropertyGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        listPropertyGroups(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see listPropertyGroups */
    fun listPropertyGroups(
        params: MediaBridgeListPropertyGroupsParams
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        listPropertyGroups(params, RequestOptions.none())

    /** @see listPropertyGroups */
    fun listPropertyGroups(
        params: MediaBridgeListPropertyGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging>

    /** Get the schemas for all object types. */
    fun listSchemas(appId: Int): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        listSchemas(appId, MediaBridgeListSchemasParams.none())

    /** @see listSchemas */
    fun listSchemas(
        appId: Int,
        params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        listSchemas(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSchemas */
    fun listSchemas(
        appId: Int,
        params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        listSchemas(appId, params, RequestOptions.none())

    /** @see listSchemas */
    fun listSchemas(
        params: MediaBridgeListSchemasParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging>

    /** @see listSchemas */
    fun listSchemas(
        params: MediaBridgeListSchemasParams
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        listSchemas(params, RequestOptions.none())

    /** @see listSchemas */
    fun listSchemas(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        listSchemas(appId, MediaBridgeListSchemasParams.none(), requestOptions)

    /** Register the name that your app will display when a user is selecting media bridge items. */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: Int,
        params: MediaBridgeRegisterAppNameParams,
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        registerAppName(appId, params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: Int,
        params: MediaBridgeRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: MediaBridgeRegisterAppNameParams
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        registerAppName(params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: MediaBridgeRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse>

    /** Set the visibility settings for media bridge events created by your app. */
    fun updateEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
    ): CompletableFuture<EventVisibilityChange> =
        updateEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        appId: Int,
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityChange> =
        updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: MediaBridgeUpdateEventVisibilitySettingsParams
    ): CompletableFuture<EventVisibilityChange> =
        updateEventVisibilitySettings(params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityChange>

    /** Update an existing oEmbed domain. */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeUpdateOembedDomainParams,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: MediaBridgeUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        updateOembedDomain(
            params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
            requestOptions,
        )

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: MediaBridgeUpdateOembedDomainParams
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        updateOembedDomain(params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: MediaBridgeUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel>

    /** Update an existing property for an object type. */
    fun updateProperty(
        propertyName: String,
        params: MediaBridgeUpdatePropertyParams,
    ): CompletableFuture<MediaBridgeProperty> =
        updateProperty(propertyName, params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        propertyName: String,
        params: MediaBridgeUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProperty> =
        updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see updateProperty */
    fun updateProperty(
        params: MediaBridgeUpdatePropertyParams
    ): CompletableFuture<MediaBridgeProperty> = updateProperty(params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        params: MediaBridgeUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProperty>

    /** Update an existing property group by name. */
    fun updatePropertyGroup(
        groupName: String,
        params: MediaBridgeUpdatePropertyGroupParams,
    ): CompletableFuture<PropertyGroup> =
        updatePropertyGroup(groupName, params, RequestOptions.none())

    /** @see updatePropertyGroup */
    fun updatePropertyGroup(
        groupName: String,
        params: MediaBridgeUpdatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        updatePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see updatePropertyGroup */
    fun updatePropertyGroup(
        params: MediaBridgeUpdatePropertyGroupParams
    ): CompletableFuture<PropertyGroup> = updatePropertyGroup(params, RequestOptions.none())

    /** @see updatePropertyGroup */
    fun updatePropertyGroup(
        params: MediaBridgeUpdatePropertyGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    /** Update the schema for an existing object type */
    fun updateSchema(
        objectType: String,
        params: MediaBridgeUpdateSchemaParams,
    ): CompletableFuture<ObjectTypeDefinition> =
        updateSchema(objectType, params, RequestOptions.none())

    /** @see updateSchema */
    fun updateSchema(
        objectType: String,
        params: MediaBridgeUpdateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeDefinition> =
        updateSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see updateSchema */
    fun updateSchema(
        params: MediaBridgeUpdateSchemaParams
    ): CompletableFuture<ObjectTypeDefinition> = updateSchema(params, RequestOptions.none())

    /** @see updateSchema */
    fun updateSchema(
        params: MediaBridgeUpdateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeDefinition>

    /** Update the name that your app will display when a user is selecting media bridge items. */
    fun updateSettings(
        appId: Int,
        params: MediaBridgeUpdateSettingsParams,
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: MediaBridgeUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(
        params: MediaBridgeUpdateSettingsParams
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: MediaBridgeUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse>

    /**
     * A view of [MediaBridgeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/schemas/{objectType}/associations`, but is otherwise the
         * same as [MediaBridgeServiceAsync.createAssociation].
         */
        fun createAssociation(
            objectType: String,
            params: MediaBridgeCreateAssociationParams,
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        fun createAssociation(
            objectType: String,
            params: MediaBridgeCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        fun createAssociation(
            params: MediaBridgeCreateAssociationParams
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        fun createAssociation(
            params: MediaBridgeCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>>

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/events/attention-span`, but
         * is otherwise the same as [MediaBridgeServiceAsync.createAttentionSpanEvent].
         */
        fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> =
            createAttentionSpanEvent(params, RequestOptions.none())

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>>

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> =
            createAttentionSpanEvent(
                MediaBridgeCreateAttentionSpanEventParams.builder()
                    .attentionSpanEventRequest(attentionSpanEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> =
            createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/events/media-played`, but is
         * otherwise the same as [MediaBridgeServiceAsync.createMediaPlayedEvent].
         */
        fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> =
            createMediaPlayedEvent(params, RequestOptions.none())

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>>

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> =
            createMediaPlayedEvent(
                MediaBridgeCreateMediaPlayedEventParams.builder()
                    .mediaPlayedEventRequest(mediaPlayedEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> =
            createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/events/media-played-percent`,
         * but is otherwise the same as [MediaBridgeServiceAsync.createMediaPlayedPercentEvent].
         */
        fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> =
            createMediaPlayedPercentEvent(params, RequestOptions.none())

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>>

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> =
            createMediaPlayedPercentEvent(
                MediaBridgeCreateMediaPlayedPercentEventParams.builder()
                    .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> =
            createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/settings/object-definitions`, but is otherwise the same as
         * [MediaBridgeServiceAsync.createObjectType].
         */
        fun createObjectType(
            appId: Int,
            params: MediaBridgeCreateObjectTypeParams,
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> =
            createObjectType(appId, params, RequestOptions.none())

        /** @see createObjectType */
        fun createObjectType(
            appId: Int,
            params: MediaBridgeCreateObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> =
            createObjectType(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createObjectType */
        fun createObjectType(
            params: MediaBridgeCreateObjectTypeParams
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> =
            createObjectType(params, RequestOptions.none())

        /** @see createObjectType */
        fun createObjectType(
            params: MediaBridgeCreateObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [MediaBridgeServiceAsync.createOembedDomain].
         */
        fun createOembedDomain(
            appId: Int,
            params: MediaBridgeCreateOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            createOembedDomain(appId, params, RequestOptions.none())

        /** @see createOembedDomain */
        fun createOembedDomain(
            appId: Int,
            params: MediaBridgeCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOembedDomain */
        fun createOembedDomain(
            params: MediaBridgeCreateOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            createOembedDomain(params, RequestOptions.none())

        /** @see createOembedDomain */
        fun createOembedDomain(
            params: MediaBridgeCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}`, but is otherwise the same as
         * [MediaBridgeServiceAsync.createProperty].
         */
        fun createProperty(
            objectType: String,
            params: MediaBridgeCreatePropertyParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            createProperty(objectType, params, RequestOptions.none())

        /** @see createProperty */
        fun createProperty(
            objectType: String,
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            createProperty(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createProperty */
        fun createProperty(
            params: MediaBridgeCreatePropertyParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            createProperty(params, RequestOptions.none())

        /** @see createProperty */
        fun createProperty(
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups`, but is otherwise the same
         * as [MediaBridgeServiceAsync.createPropertyGroup].
         */
        fun createPropertyGroup(
            objectType: String,
            params: MediaBridgeCreatePropertyGroupParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            createPropertyGroup(objectType, params, RequestOptions.none())

        /** @see createPropertyGroup */
        fun createPropertyGroup(
            objectType: String,
            params: MediaBridgeCreatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            createPropertyGroup(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createPropertyGroup */
        fun createPropertyGroup(
            params: MediaBridgeCreatePropertyGroupParams
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            createPropertyGroup(params, RequestOptions.none())

        /** @see createPropertyGroup */
        fun createPropertyGroup(
            params: MediaBridgeCreatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/settings/video-association-definition`, but is otherwise
         * the same as [MediaBridgeServiceAsync.createVideoAssociationDefinition].
         */
        fun createVideoAssociationDefinition(
            appId: Int
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
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
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createVideoAssociationDefinition(
                params.toBuilder().appId(appId).build(),
                requestOptions,
            )

        /** @see createVideoAssociationDefinition */
        fun createVideoAssociationDefinition(
            appId: Int,
            params: MediaBridgeCreateVideoAssociationDefinitionParams =
                MediaBridgeCreateVideoAssociationDefinitionParams.none(),
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createVideoAssociationDefinition(appId, params, RequestOptions.none())

        /** @see createVideoAssociationDefinition */
        fun createVideoAssociationDefinition(
            params: MediaBridgeCreateVideoAssociationDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>>

        /** @see createVideoAssociationDefinition */
        fun createVideoAssociationDefinition(
            params: MediaBridgeCreateVideoAssociationDefinitionParams
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createVideoAssociationDefinition(params, RequestOptions.none())

        /** @see createVideoAssociationDefinition */
        fun createVideoAssociationDefinition(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createVideoAssociationDefinition(
                appId,
                MediaBridgeCreateVideoAssociationDefinitionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/schemas/{objectType}/associations/{associationId}`, but is
         * otherwise the same as [MediaBridgeServiceAsync.deleteAssociation].
         */
        fun deleteAssociation(
            associationId: String,
            params: MediaBridgeDeleteAssociationParams,
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(associationId, params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            associationId: String,
            params: MediaBridgeDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(
                params.toBuilder().associationId(associationId).build(),
                requestOptions,
            )

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: MediaBridgeDeleteAssociationParams
        ): CompletableFuture<HttpResponse> = deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: MediaBridgeDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [MediaBridgeServiceAsync.deleteOembedDomain].
         */
        fun deleteOembedDomain(appId: Int): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: Int,
            params: MediaBridgeDeleteOembedDomainParams =
                MediaBridgeDeleteOembedDomainParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: Int,
            params: MediaBridgeDeleteOembedDomainParams = MediaBridgeDeleteOembedDomainParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, params, RequestOptions.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            params: MediaBridgeDeleteOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            params: MediaBridgeDeleteOembedDomainParams
        ): CompletableFuture<HttpResponse> = deleteOembedDomain(params, RequestOptions.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, MediaBridgeDeleteOembedDomainParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}`, but is otherwise
         * the same as [MediaBridgeServiceAsync.deleteProperty].
         */
        fun deleteProperty(
            propertyName: String,
            params: MediaBridgeDeletePropertyParams,
        ): CompletableFuture<HttpResponse> =
            deleteProperty(propertyName, params, RequestOptions.none())

        /** @see deleteProperty */
        fun deleteProperty(
            propertyName: String,
            params: MediaBridgeDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see deleteProperty */
        fun deleteProperty(
            params: MediaBridgeDeletePropertyParams
        ): CompletableFuture<HttpResponse> = deleteProperty(params, RequestOptions.none())

        /** @see deleteProperty */
        fun deleteProperty(
            params: MediaBridgeDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}`, but is
         * otherwise the same as [MediaBridgeServiceAsync.deletePropertyGroup].
         */
        fun deletePropertyGroup(
            groupName: String,
            params: MediaBridgeDeletePropertyGroupParams,
        ): CompletableFuture<HttpResponse> =
            deletePropertyGroup(groupName, params, RequestOptions.none())

        /** @see deletePropertyGroup */
        fun deletePropertyGroup(
            groupName: String,
            params: MediaBridgeDeletePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deletePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see deletePropertyGroup */
        fun deletePropertyGroup(
            params: MediaBridgeDeletePropertyGroupParams
        ): CompletableFuture<HttpResponse> = deletePropertyGroup(params, RequestOptions.none())

        /** @see deletePropertyGroup */
        fun deletePropertyGroup(
            params: MediaBridgeDeletePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/event-visibility`, but is otherwise the same as
         * [MediaBridgeServiceAsync.getEventVisibilitySettings].
         */
        fun getEventVisibilitySettings(
            appId: Int
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(appId, MediaBridgeGetEventVisibilitySettingsParams.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeGetEventVisibilitySettingsParams =
                MediaBridgeGetEventVisibilitySettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeGetEventVisibilitySettingsParams =
                MediaBridgeGetEventVisibilitySettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            params: MediaBridgeGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>>

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            params: MediaBridgeGetEventVisibilitySettingsParams
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(
                appId,
                MediaBridgeGetEventVisibilitySettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise
         * the same as [MediaBridgeServiceAsync.getOembedDomain].
         */
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeGetOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see getOembedDomain */
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            getOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see getOembedDomain */
        fun getOembedDomain(
            params: MediaBridgeGetOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            getOembedDomain(params, RequestOptions.none())

        /** @see getOembedDomain */
        fun getOembedDomain(
            params: MediaBridgeGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}`, but is otherwise
         * the same as [MediaBridgeServiceAsync.getProperty].
         */
        fun getProperty(
            propertyName: String,
            params: MediaBridgeGetPropertyParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            getProperty(propertyName, params, RequestOptions.none())

        /** @see getProperty */
        fun getProperty(
            propertyName: String,
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            getProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see getProperty */
        fun getProperty(
            params: MediaBridgeGetPropertyParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            getProperty(params, RequestOptions.none())

        /** @see getProperty */
        fun getProperty(
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}`, but is
         * otherwise the same as [MediaBridgeServiceAsync.getPropertyGroup].
         */
        fun getPropertyGroup(
            groupName: String,
            params: MediaBridgeGetPropertyGroupParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            getPropertyGroup(groupName, params, RequestOptions.none())

        /** @see getPropertyGroup */
        fun getPropertyGroup(
            groupName: String,
            params: MediaBridgeGetPropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            getPropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see getPropertyGroup */
        fun getPropertyGroup(
            params: MediaBridgeGetPropertyGroupParams
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            getPropertyGroup(params, RequestOptions.none())

        /** @see getPropertyGroup */
        fun getPropertyGroup(
            params: MediaBridgeGetPropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>

        /**
         * Returns a raw HTTP response for `get /media-bridge/2026-03/{appId}/schemas/{objectType}`,
         * but is otherwise the same as [MediaBridgeServiceAsync.getSchema].
         */
        fun getSchema(
            objectType: String,
            params: MediaBridgeGetSchemaParams,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            getSchema(objectType, params, RequestOptions.none())

        /** @see getSchema */
        fun getSchema(
            objectType: String,
            params: MediaBridgeGetSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            getSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see getSchema */
        fun getSchema(
            params: MediaBridgeGetSchemaParams
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            getSchema(params, RequestOptions.none())

        /** @see getSchema */
        fun getSchema(
            params: MediaBridgeGetSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/object-definitions/{mediaType}`, but is otherwise
         * the same as [MediaBridgeServiceAsync.listObjectTypesByMediaType].
         */
        fun listObjectTypesByMediaType(
            mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
            params: MediaBridgeListObjectTypesByMediaTypeParams,
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> =
            listObjectTypesByMediaType(mediaType, params, RequestOptions.none())

        /** @see listObjectTypesByMediaType */
        fun listObjectTypesByMediaType(
            mediaType: MediaBridgeListObjectTypesByMediaTypeParams.MediaType,
            params: MediaBridgeListObjectTypesByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> =
            listObjectTypesByMediaType(
                params.toBuilder().mediaType(mediaType).build(),
                requestOptions,
            )

        /** @see listObjectTypesByMediaType */
        fun listObjectTypesByMediaType(
            params: MediaBridgeListObjectTypesByMediaTypeParams
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> =
            listObjectTypesByMediaType(params, RequestOptions.none())

        /** @see listObjectTypesByMediaType */
        fun listObjectTypesByMediaType(
            params: MediaBridgeListObjectTypesByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [MediaBridgeServiceAsync.listOembedDomains].
         */
        fun listOembedDomains(
            appId: Int
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: Int,
            params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: Int,
            params: MediaBridgeListOembedDomainsParams = MediaBridgeListOembedDomainsParams.none(),
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(appId, params, RequestOptions.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            params: MediaBridgeListOembedDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>>

        /** @see listOembedDomains */
        fun listOembedDomains(
            params: MediaBridgeListOembedDomainsParams
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(params, RequestOptions.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(appId, MediaBridgeListOembedDomainsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}`, but is otherwise the same as
         * [MediaBridgeServiceAsync.listProperties].
         */
        fun listProperties(
            objectType: String,
            params: MediaBridgeListPropertiesParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            listProperties(objectType, params, RequestOptions.none())

        /** @see listProperties */
        fun listProperties(
            objectType: String,
            params: MediaBridgeListPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            listProperties(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see listProperties */
        fun listProperties(
            params: MediaBridgeListPropertiesParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            listProperties(params, RequestOptions.none())

        /** @see listProperties */
        fun listProperties(
            params: MediaBridgeListPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups`, but is otherwise the same
         * as [MediaBridgeServiceAsync.listPropertyGroups].
         */
        fun listPropertyGroups(
            objectType: String,
            params: MediaBridgeListPropertyGroupsParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            listPropertyGroups(objectType, params, RequestOptions.none())

        /** @see listPropertyGroups */
        fun listPropertyGroups(
            objectType: String,
            params: MediaBridgeListPropertyGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            listPropertyGroups(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see listPropertyGroups */
        fun listPropertyGroups(
            params: MediaBridgeListPropertyGroupsParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            listPropertyGroups(params, RequestOptions.none())

        /** @see listPropertyGroups */
        fun listPropertyGroups(
            params: MediaBridgeListPropertyGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>>

        /**
         * Returns a raw HTTP response for `get /media-bridge/2026-03/{appId}/schemas`, but is
         * otherwise the same as [MediaBridgeServiceAsync.listSchemas].
         */
        fun listSchemas(
            appId: Int
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            listSchemas(appId, MediaBridgeListSchemasParams.none())

        /** @see listSchemas */
        fun listSchemas(
            appId: Int,
            params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            listSchemas(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSchemas */
        fun listSchemas(
            appId: Int,
            params: MediaBridgeListSchemasParams = MediaBridgeListSchemasParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            listSchemas(appId, params, RequestOptions.none())

        /** @see listSchemas */
        fun listSchemas(
            params: MediaBridgeListSchemasParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>>

        /** @see listSchemas */
        fun listSchemas(
            params: MediaBridgeListSchemasParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            listSchemas(params, RequestOptions.none())

        /** @see listSchemas */
        fun listSchemas(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            listSchemas(appId, MediaBridgeListSchemasParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /media-bridge/2026-03/{appId}/settings/register`,
         * but is otherwise the same as [MediaBridgeServiceAsync.registerAppName].
         */
        @Deprecated("deprecated")
        fun registerAppName(
            appId: Int,
            params: MediaBridgeRegisterAppNameParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            registerAppName(appId, params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            appId: Int,
            params: MediaBridgeRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            params: MediaBridgeRegisterAppNameParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            registerAppName(params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            params: MediaBridgeRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/settings/event-visibility`, but is otherwise the same as
         * [MediaBridgeServiceAsync.updateEventVisibilitySettings].
         */
        fun updateEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> =
            updateEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            appId: Int,
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> =
            updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            params: MediaBridgeUpdateEventVisibilitySettingsParams
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> =
            updateEventVisibilitySettings(params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise
         * the same as [MediaBridgeServiceAsync.updateOembedDomain].
         */
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeUpdateOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: MediaBridgeUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            updateOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            params: MediaBridgeUpdateOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            updateOembedDomain(params, RequestOptions.none())

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            params: MediaBridgeUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}`, but is otherwise
         * the same as [MediaBridgeServiceAsync.updateProperty].
         */
        fun updateProperty(
            propertyName: String,
            params: MediaBridgeUpdatePropertyParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            updateProperty(propertyName, params, RequestOptions.none())

        /** @see updateProperty */
        fun updateProperty(
            propertyName: String,
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see updateProperty */
        fun updateProperty(
            params: MediaBridgeUpdatePropertyParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> =
            updateProperty(params, RequestOptions.none())

        /** @see updateProperty */
        fun updateProperty(
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}`, but is
         * otherwise the same as [MediaBridgeServiceAsync.updatePropertyGroup].
         */
        fun updatePropertyGroup(
            groupName: String,
            params: MediaBridgeUpdatePropertyGroupParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            updatePropertyGroup(groupName, params, RequestOptions.none())

        /** @see updatePropertyGroup */
        fun updatePropertyGroup(
            groupName: String,
            params: MediaBridgeUpdatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            updatePropertyGroup(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see updatePropertyGroup */
        fun updatePropertyGroup(
            params: MediaBridgeUpdatePropertyGroupParams
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            updatePropertyGroup(params, RequestOptions.none())

        /** @see updatePropertyGroup */
        fun updatePropertyGroup(
            params: MediaBridgeUpdatePropertyGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/2026-03/{appId}/schemas/{objectType}`, but is otherwise the same as
         * [MediaBridgeServiceAsync.updateSchema].
         */
        fun updateSchema(
            objectType: String,
            params: MediaBridgeUpdateSchemaParams,
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> =
            updateSchema(objectType, params, RequestOptions.none())

        /** @see updateSchema */
        fun updateSchema(
            objectType: String,
            params: MediaBridgeUpdateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> =
            updateSchema(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see updateSchema */
        fun updateSchema(
            params: MediaBridgeUpdateSchemaParams
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> =
            updateSchema(params, RequestOptions.none())

        /** @see updateSchema */
        fun updateSchema(
            params: MediaBridgeUpdateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>>

        /**
         * Returns a raw HTTP response for `put /media-bridge/2026-03/{appId}/settings`, but is
         * otherwise the same as [MediaBridgeServiceAsync.updateSettings].
         */
        fun updateSettings(
            appId: Int,
            params: MediaBridgeUpdateSettingsParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            appId: Int,
            params: MediaBridgeUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        fun updateSettings(
            params: MediaBridgeUpdateSettingsParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            params: MediaBridgeUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>>
    }
}
