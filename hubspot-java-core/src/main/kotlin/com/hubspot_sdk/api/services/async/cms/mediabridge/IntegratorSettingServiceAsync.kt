// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingDeleteOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetEventVisibilitySettingsResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingListOembedDomainsResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingRegisterAppNameResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateAppNameResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateEventVisibilitySettingsResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateOembedDomainResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntegratorSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegratorSettingServiceAsync

    /** Create a new media object type */
    fun createObjectDefinition(
        appId: String,
        params: IntegratorSettingCreateObjectDefinitionParams,
    ): CompletableFuture<IntegratorSettingCreateObjectDefinitionResponse> =
        createObjectDefinition(appId, params, RequestOptions.none())

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        appId: String,
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingCreateObjectDefinitionResponse> =
        createObjectDefinition(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams
    ): CompletableFuture<IntegratorSettingCreateObjectDefinitionResponse> =
        createObjectDefinition(params, RequestOptions.none())

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingCreateObjectDefinitionResponse>

    /** Set up a new oEmbed domain for your media bridge app. */
    fun createOembedDomain(
        appId: String,
        params: IntegratorSettingCreateOembedDomainParams,
    ): CompletableFuture<IntegratorSettingCreateOembedDomainResponse> =
        createOembedDomain(appId, params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        appId: String,
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingCreateOembedDomainResponse> =
        createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams
    ): CompletableFuture<IntegratorSettingCreateOembedDomainResponse> =
        createOembedDomain(params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingCreateOembedDomainResponse>

    /** Delete an existing oEmbed domain. */
    fun deleteOembedDomain(appId: String): CompletableFuture<Void?> =
        deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: String,
        params: IntegratorSettingDeleteOembedDomainParams =
            IntegratorSettingDeleteOembedDomainParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: String,
        params: IntegratorSettingDeleteOembedDomainParams =
            IntegratorSettingDeleteOembedDomainParams.none(),
    ): CompletableFuture<Void?> = deleteOembedDomain(appId, params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams
    ): CompletableFuture<Void?> = deleteOembedDomain(params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none(), requestOptions)

    /** Get the visibility settings for media bridge events for your apps. */
    fun getEventVisibilitySettings(
        appId: String
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse> =
        getEventVisibilitySettings(appId, IntegratorSettingGetEventVisibilitySettingsParams.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingGetEventVisibilitySettingsParams =
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse> =
        getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingGetEventVisibilitySettingsParams =
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse> =
        getEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse>

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse> =
        getEventVisibilitySettings(params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse> =
        getEventVisibilitySettings(
            appId,
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
            requestOptions,
        )

    /** Get the existing objects types that belong to the specified media type. */
    fun getObjectDefinitionsByMediaType(
        mediaType: String,
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
    ): CompletableFuture<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
        getObjectDefinitionsByMediaType(mediaType, params, RequestOptions.none())

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        mediaType: String,
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
        getObjectDefinitionsByMediaType(
            params.toBuilder().mediaType(mediaType).build(),
            requestOptions,
        )

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams
    ): CompletableFuture<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
        getObjectDefinitionsByMediaType(params, RequestOptions.none())

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>

    /** Get the details for an existing oEmbed domain. */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingGetOembedDomainParams,
    ): CompletableFuture<IntegratorSettingGetOembedDomainResponse> =
        getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingGetOembedDomainResponse> =
        getOembedDomain(params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(), requestOptions)

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams
    ): CompletableFuture<IntegratorSettingGetOembedDomainResponse> =
        getOembedDomain(params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingGetOembedDomainResponse>

    /** Get the details for existing oEmbed domains for your app */
    fun listOembedDomains(
        appId: String
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse> =
        listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: String,
        params: IntegratorSettingListOembedDomainsParams =
            IntegratorSettingListOembedDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse> =
        listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: String,
        params: IntegratorSettingListOembedDomainsParams =
            IntegratorSettingListOembedDomainsParams.none(),
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse> =
        listOembedDomains(appId, params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse>

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse> =
        listOembedDomains(params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse> =
        listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none(), requestOptions)

    /** Register the name that your app will display when a user is selecting media bridge items. */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: String,
        params: IntegratorSettingRegisterAppNameParams,
    ): CompletableFuture<IntegratorSettingRegisterAppNameResponse> =
        registerAppName(appId, params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: String,
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingRegisterAppNameResponse> =
        registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams
    ): CompletableFuture<IntegratorSettingRegisterAppNameResponse> =
        registerAppName(params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingRegisterAppNameResponse>

    /** Update the name that your app will display when a user is selecting media bridge items. */
    fun updateAppName(
        appId: String,
        params: IntegratorSettingUpdateAppNameParams,
    ): CompletableFuture<IntegratorSettingUpdateAppNameResponse> =
        updateAppName(appId, params, RequestOptions.none())

    /** @see updateAppName */
    fun updateAppName(
        appId: String,
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingUpdateAppNameResponse> =
        updateAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateAppName */
    fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams
    ): CompletableFuture<IntegratorSettingUpdateAppNameResponse> =
        updateAppName(params, RequestOptions.none())

    /** @see updateAppName */
    fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingUpdateAppNameResponse>

    /** Set the visibility settings for media bridge events created by your app. */
    fun updateEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
    ): CompletableFuture<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
        updateEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
        updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams
    ): CompletableFuture<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
        updateEventVisibilitySettings(params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingUpdateEventVisibilitySettingsResponse>

    /** Update an existing oEmbed domain. */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingUpdateOembedDomainParams,
    ): CompletableFuture<IntegratorSettingUpdateOembedDomainResponse> =
        updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingUpdateOembedDomainResponse> =
        updateOembedDomain(
            params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
            requestOptions,
        )

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams
    ): CompletableFuture<IntegratorSettingUpdateOembedDomainResponse> =
        updateOembedDomain(params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorSettingUpdateOembedDomainResponse>

    /**
     * A view of [IntegratorSettingServiceAsync] that provides access to raw HTTP responses for each
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
        ): IntegratorSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/settings/object-definitions`, but is otherwise the same as
         * [IntegratorSettingServiceAsync.createObjectDefinition].
         */
        fun createObjectDefinition(
            appId: String,
            params: IntegratorSettingCreateObjectDefinitionParams,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse>> =
            createObjectDefinition(appId, params, RequestOptions.none())

        /** @see createObjectDefinition */
        fun createObjectDefinition(
            appId: String,
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse>> =
            createObjectDefinition(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createObjectDefinition */
        fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse>> =
            createObjectDefinition(params, RequestOptions.none())

        /** @see createObjectDefinition */
        fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse>>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/settings/oembed-domains`,
         * but is otherwise the same as [IntegratorSettingServiceAsync.createOembedDomain].
         */
        fun createOembedDomain(
            appId: String,
            params: IntegratorSettingCreateOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateOembedDomainResponse>> =
            createOembedDomain(appId, params, RequestOptions.none())

        /** @see createOembedDomain */
        fun createOembedDomain(
            appId: String,
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateOembedDomainResponse>> =
            createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOembedDomain */
        fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateOembedDomainResponse>> =
            createOembedDomain(params, RequestOptions.none())

        /** @see createOembedDomain */
        fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateOembedDomainResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [IntegratorSettingServiceAsync.deleteOembedDomain].
         */
        fun deleteOembedDomain(appId: String): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: String,
            params: IntegratorSettingDeleteOembedDomainParams =
                IntegratorSettingDeleteOembedDomainParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: String,
            params: IntegratorSettingDeleteOembedDomainParams =
                IntegratorSettingDeleteOembedDomainParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, params, RequestOptions.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams
        ): CompletableFuture<HttpResponse> = deleteOembedDomain(params, RequestOptions.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(
                appId,
                IntegratorSettingDeleteOembedDomainParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/settings/event-visibility`,
         * but is otherwise the same as [IntegratorSettingServiceAsync.getEventVisibilitySettings].
         */
        fun getEventVisibilitySettings(
            appId: String
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>> =
            getEventVisibilitySettings(
                appId,
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
            )

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingGetEventVisibilitySettingsParams =
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>> =
            getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingGetEventVisibilitySettingsParams =
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>> =
            getEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>>

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>> =
            getEventVisibilitySettings(params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>> =
            getEventVisibilitySettings(
                appId,
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/settings/object-definitions/{mediaType}`, but is otherwise the
         * same as [IntegratorSettingServiceAsync.getObjectDefinitionsByMediaType].
         */
        fun getObjectDefinitionsByMediaType(
            mediaType: String,
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>
        > = getObjectDefinitionsByMediaType(mediaType, params, RequestOptions.none())

        /** @see getObjectDefinitionsByMediaType */
        fun getObjectDefinitionsByMediaType(
            mediaType: String,
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>
        > =
            getObjectDefinitionsByMediaType(
                params.toBuilder().mediaType(mediaType).build(),
                requestOptions,
            )

        /** @see getObjectDefinitionsByMediaType */
        fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>
        > = getObjectDefinitionsByMediaType(params, RequestOptions.none())

        /** @see getObjectDefinitionsByMediaType */
        fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>
        >

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise the
         * same as [IntegratorSettingServiceAsync.getOembedDomain].
         */
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingGetOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetOembedDomainResponse>> =
            getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see getOembedDomain */
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetOembedDomainResponse>> =
            getOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see getOembedDomain */
        fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetOembedDomainResponse>> =
            getOembedDomain(params, RequestOptions.none())

        /** @see getOembedDomain */
        fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetOembedDomainResponse>>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/settings/oembed-domains`,
         * but is otherwise the same as [IntegratorSettingServiceAsync.listOembedDomains].
         */
        fun listOembedDomains(
            appId: String
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>> =
            listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: String,
            params: IntegratorSettingListOembedDomainsParams =
                IntegratorSettingListOembedDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>> =
            listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: String,
            params: IntegratorSettingListOembedDomainsParams =
                IntegratorSettingListOembedDomainsParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>> =
            listOembedDomains(appId, params, RequestOptions.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>>

        /** @see listOembedDomains */
        fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>> =
            listOembedDomains(params, RequestOptions.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>> =
            listOembedDomains(
                appId,
                IntegratorSettingListOembedDomainsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/settings/register`, but is
         * otherwise the same as [IntegratorSettingServiceAsync.registerAppName].
         */
        @Deprecated("deprecated")
        fun registerAppName(
            appId: String,
            params: IntegratorSettingRegisterAppNameParams,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingRegisterAppNameResponse>> =
            registerAppName(appId, params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            appId: String,
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingRegisterAppNameResponse>> =
            registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingRegisterAppNameResponse>> =
            registerAppName(params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingRegisterAppNameResponse>>

        /**
         * Returns a raw HTTP response for `put /media-bridge/v1/{appId}/settings`, but is otherwise
         * the same as [IntegratorSettingServiceAsync.updateAppName].
         */
        fun updateAppName(
            appId: String,
            params: IntegratorSettingUpdateAppNameParams,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateAppNameResponse>> =
            updateAppName(appId, params, RequestOptions.none())

        /** @see updateAppName */
        fun updateAppName(
            appId: String,
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateAppNameResponse>> =
            updateAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateAppName */
        fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateAppNameResponse>> =
            updateAppName(params, RequestOptions.none())

        /** @see updateAppName */
        fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateAppNameResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/settings/event-visibility`, but is otherwise the same as
         * [IntegratorSettingServiceAsync.updateEventVisibilitySettings].
         */
        fun updateEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse>
        > = updateEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse>
        > = updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse>
        > = updateEventVisibilitySettings(params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse>
        >

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise the
         * same as [IntegratorSettingServiceAsync.updateOembedDomain].
         */
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingUpdateOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse>> =
            updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse>> =
            updateOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse>> =
            updateOembedDomain(params, RequestOptions.none())

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse>>
    }
}
