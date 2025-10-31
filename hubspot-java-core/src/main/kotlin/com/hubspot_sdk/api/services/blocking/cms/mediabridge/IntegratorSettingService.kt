// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface IntegratorSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegratorSettingService

    /** Create a new media object type */
    fun createObjectDefinition(
        appId: String,
        params: IntegratorSettingCreateObjectDefinitionParams,
    ): IntegratorSettingCreateObjectDefinitionResponse =
        createObjectDefinition(appId, params, RequestOptions.none())

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        appId: String,
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingCreateObjectDefinitionResponse =
        createObjectDefinition(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams
    ): IntegratorSettingCreateObjectDefinitionResponse =
        createObjectDefinition(params, RequestOptions.none())

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingCreateObjectDefinitionResponse

    /** Set up a new oEmbed domain for your media bridge app. */
    fun createOembedDomain(
        appId: String,
        params: IntegratorSettingCreateOembedDomainParams,
    ): IntegratorSettingCreateOembedDomainResponse =
        createOembedDomain(appId, params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        appId: String,
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingCreateOembedDomainResponse =
        createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams
    ): IntegratorSettingCreateOembedDomainResponse =
        createOembedDomain(params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingCreateOembedDomainResponse

    /** Delete an existing oEmbed domain. */
    fun deleteOembedDomain(appId: String) =
        deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: String,
        params: IntegratorSettingDeleteOembedDomainParams =
            IntegratorSettingDeleteOembedDomainParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: String,
        params: IntegratorSettingDeleteOembedDomainParams =
            IntegratorSettingDeleteOembedDomainParams.none(),
    ) = deleteOembedDomain(appId, params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(params: IntegratorSettingDeleteOembedDomainParams) =
        deleteOembedDomain(params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(appId: String, requestOptions: RequestOptions) =
        deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none(), requestOptions)

    /** Get the visibility settings for media bridge events for your apps. */
    fun getEventVisibilitySettings(
        appId: String
    ): IntegratorSettingGetEventVisibilitySettingsResponse =
        getEventVisibilitySettings(appId, IntegratorSettingGetEventVisibilitySettingsParams.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingGetEventVisibilitySettingsParams =
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingGetEventVisibilitySettingsResponse =
        getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingGetEventVisibilitySettingsParams =
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
    ): IntegratorSettingGetEventVisibilitySettingsResponse =
        getEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingGetEventVisibilitySettingsResponse

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams
    ): IntegratorSettingGetEventVisibilitySettingsResponse =
        getEventVisibilitySettings(params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: String,
        requestOptions: RequestOptions,
    ): IntegratorSettingGetEventVisibilitySettingsResponse =
        getEventVisibilitySettings(
            appId,
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
            requestOptions,
        )

    /** Get the existing objects types that belong to the specified media type. */
    fun getObjectDefinitionsByMediaType(
        mediaType: String,
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
    ): IntegratorSettingGetObjectDefinitionsByMediaTypeResponse =
        getObjectDefinitionsByMediaType(mediaType, params, RequestOptions.none())

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        mediaType: String,
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingGetObjectDefinitionsByMediaTypeResponse =
        getObjectDefinitionsByMediaType(
            params.toBuilder().mediaType(mediaType).build(),
            requestOptions,
        )

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams
    ): IntegratorSettingGetObjectDefinitionsByMediaTypeResponse =
        getObjectDefinitionsByMediaType(params, RequestOptions.none())

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingGetObjectDefinitionsByMediaTypeResponse

    /** Get the details for an existing oEmbed domain. */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingGetOembedDomainParams,
    ): IntegratorSettingGetOembedDomainResponse =
        getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingGetOembedDomainResponse =
        getOembedDomain(params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(), requestOptions)

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams
    ): IntegratorSettingGetOembedDomainResponse = getOembedDomain(params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingGetOembedDomainResponse

    /** Get the details for existing oEmbed domains for your app */
    fun listOembedDomains(appId: String): IntegratorSettingListOembedDomainsResponse =
        listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: String,
        params: IntegratorSettingListOembedDomainsParams =
            IntegratorSettingListOembedDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingListOembedDomainsResponse =
        listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: String,
        params: IntegratorSettingListOembedDomainsParams =
            IntegratorSettingListOembedDomainsParams.none(),
    ): IntegratorSettingListOembedDomainsResponse =
        listOembedDomains(appId, params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingListOembedDomainsResponse

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams
    ): IntegratorSettingListOembedDomainsResponse = listOembedDomains(params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: String,
        requestOptions: RequestOptions,
    ): IntegratorSettingListOembedDomainsResponse =
        listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none(), requestOptions)

    /** Register the name that your app will display when a user is selecting media bridge items. */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: String,
        params: IntegratorSettingRegisterAppNameParams,
    ): IntegratorSettingRegisterAppNameResponse =
        registerAppName(appId, params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: String,
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingRegisterAppNameResponse =
        registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams
    ): IntegratorSettingRegisterAppNameResponse = registerAppName(params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingRegisterAppNameResponse

    /** Update the name that your app will display when a user is selecting media bridge items. */
    fun updateAppName(
        appId: String,
        params: IntegratorSettingUpdateAppNameParams,
    ): IntegratorSettingUpdateAppNameResponse = updateAppName(appId, params, RequestOptions.none())

    /** @see updateAppName */
    fun updateAppName(
        appId: String,
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingUpdateAppNameResponse =
        updateAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateAppName */
    fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams
    ): IntegratorSettingUpdateAppNameResponse = updateAppName(params, RequestOptions.none())

    /** @see updateAppName */
    fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingUpdateAppNameResponse

    /** Set the visibility settings for media bridge events created by your app. */
    fun updateEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
    ): IntegratorSettingUpdateEventVisibilitySettingsResponse =
        updateEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        appId: String,
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingUpdateEventVisibilitySettingsResponse =
        updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams
    ): IntegratorSettingUpdateEventVisibilitySettingsResponse =
        updateEventVisibilitySettings(params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingUpdateEventVisibilitySettingsResponse

    /** Update an existing oEmbed domain. */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingUpdateOembedDomainParams,
    ): IntegratorSettingUpdateOembedDomainResponse =
        updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingUpdateOembedDomainResponse =
        updateOembedDomain(
            params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
            requestOptions,
        )

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams
    ): IntegratorSettingUpdateOembedDomainResponse =
        updateOembedDomain(params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorSettingUpdateOembedDomainResponse

    /**
     * A view of [IntegratorSettingService] that provides access to raw HTTP responses for each
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
        ): IntegratorSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/settings/object-definitions`, but is otherwise the same as
         * [IntegratorSettingService.createObjectDefinition].
         */
        @MustBeClosed
        fun createObjectDefinition(
            appId: String,
            params: IntegratorSettingCreateObjectDefinitionParams,
        ): HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse> =
            createObjectDefinition(appId, params, RequestOptions.none())

        /** @see createObjectDefinition */
        @MustBeClosed
        fun createObjectDefinition(
            appId: String,
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse> =
            createObjectDefinition(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createObjectDefinition */
        @MustBeClosed
        fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams
        ): HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse> =
            createObjectDefinition(params, RequestOptions.none())

        /** @see createObjectDefinition */
        @MustBeClosed
        fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/settings/oembed-domains`,
         * but is otherwise the same as [IntegratorSettingService.createOembedDomain].
         */
        @MustBeClosed
        fun createOembedDomain(
            appId: String,
            params: IntegratorSettingCreateOembedDomainParams,
        ): HttpResponseFor<IntegratorSettingCreateOembedDomainResponse> =
            createOembedDomain(appId, params, RequestOptions.none())

        /** @see createOembedDomain */
        @MustBeClosed
        fun createOembedDomain(
            appId: String,
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingCreateOembedDomainResponse> =
            createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOembedDomain */
        @MustBeClosed
        fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams
        ): HttpResponseFor<IntegratorSettingCreateOembedDomainResponse> =
            createOembedDomain(params, RequestOptions.none())

        /** @see createOembedDomain */
        @MustBeClosed
        fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingCreateOembedDomainResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [IntegratorSettingService.deleteOembedDomain].
         */
        @MustBeClosed
        fun deleteOembedDomain(appId: String): HttpResponse =
            deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none())

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(
            appId: String,
            params: IntegratorSettingDeleteOembedDomainParams =
                IntegratorSettingDeleteOembedDomainParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(
            appId: String,
            params: IntegratorSettingDeleteOembedDomainParams =
                IntegratorSettingDeleteOembedDomainParams.none(),
        ): HttpResponse = deleteOembedDomain(appId, params, RequestOptions.none())

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(params: IntegratorSettingDeleteOembedDomainParams): HttpResponse =
            deleteOembedDomain(params, RequestOptions.none())

        /** @see deleteOembedDomain */
        @MustBeClosed
        fun deleteOembedDomain(appId: String, requestOptions: RequestOptions): HttpResponse =
            deleteOembedDomain(
                appId,
                IntegratorSettingDeleteOembedDomainParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/settings/event-visibility`,
         * but is otherwise the same as [IntegratorSettingService.getEventVisibilitySettings].
         */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: String
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse> =
            getEventVisibilitySettings(
                appId,
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
            )

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingGetEventVisibilitySettingsParams =
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse> =
            getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingGetEventVisibilitySettingsParams =
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse> =
            getEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse> =
            getEventVisibilitySettings(params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        @MustBeClosed
        fun getEventVisibilitySettings(
            appId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse> =
            getEventVisibilitySettings(
                appId,
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/settings/object-definitions/{mediaType}`, but is otherwise the
         * same as [IntegratorSettingService.getObjectDefinitionsByMediaType].
         */
        @MustBeClosed
        fun getObjectDefinitionsByMediaType(
            mediaType: String,
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        ): HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
            getObjectDefinitionsByMediaType(mediaType, params, RequestOptions.none())

        /** @see getObjectDefinitionsByMediaType */
        @MustBeClosed
        fun getObjectDefinitionsByMediaType(
            mediaType: String,
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
            getObjectDefinitionsByMediaType(
                params.toBuilder().mediaType(mediaType).build(),
                requestOptions,
            )

        /** @see getObjectDefinitionsByMediaType */
        @MustBeClosed
        fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams
        ): HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
            getObjectDefinitionsByMediaType(params, RequestOptions.none())

        /** @see getObjectDefinitionsByMediaType */
        @MustBeClosed
        fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise the
         * same as [IntegratorSettingService.getOembedDomain].
         */
        @MustBeClosed
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingGetOembedDomainParams,
        ): HttpResponseFor<IntegratorSettingGetOembedDomainResponse> =
            getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see getOembedDomain */
        @MustBeClosed
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingGetOembedDomainResponse> =
            getOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see getOembedDomain */
        @MustBeClosed
        fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams
        ): HttpResponseFor<IntegratorSettingGetOembedDomainResponse> =
            getOembedDomain(params, RequestOptions.none())

        /** @see getOembedDomain */
        @MustBeClosed
        fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingGetOembedDomainResponse>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/settings/oembed-domains`,
         * but is otherwise the same as [IntegratorSettingService.listOembedDomains].
         */
        @MustBeClosed
        fun listOembedDomains(
            appId: String
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse> =
            listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none())

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            appId: String,
            params: IntegratorSettingListOembedDomainsParams =
                IntegratorSettingListOembedDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse> =
            listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            appId: String,
            params: IntegratorSettingListOembedDomainsParams =
                IntegratorSettingListOembedDomainsParams.none(),
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse> =
            listOembedDomains(appId, params, RequestOptions.none())

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse>

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse> =
            listOembedDomains(params, RequestOptions.none())

        /** @see listOembedDomains */
        @MustBeClosed
        fun listOembedDomains(
            appId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse> =
            listOembedDomains(
                appId,
                IntegratorSettingListOembedDomainsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/settings/register`, but is
         * otherwise the same as [IntegratorSettingService.registerAppName].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            appId: String,
            params: IntegratorSettingRegisterAppNameParams,
        ): HttpResponseFor<IntegratorSettingRegisterAppNameResponse> =
            registerAppName(appId, params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            appId: String,
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingRegisterAppNameResponse> =
            registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see registerAppName */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams
        ): HttpResponseFor<IntegratorSettingRegisterAppNameResponse> =
            registerAppName(params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        @MustBeClosed
        fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingRegisterAppNameResponse>

        /**
         * Returns a raw HTTP response for `put /media-bridge/v1/{appId}/settings`, but is otherwise
         * the same as [IntegratorSettingService.updateAppName].
         */
        @MustBeClosed
        fun updateAppName(
            appId: String,
            params: IntegratorSettingUpdateAppNameParams,
        ): HttpResponseFor<IntegratorSettingUpdateAppNameResponse> =
            updateAppName(appId, params, RequestOptions.none())

        /** @see updateAppName */
        @MustBeClosed
        fun updateAppName(
            appId: String,
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingUpdateAppNameResponse> =
            updateAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateAppName */
        @MustBeClosed
        fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams
        ): HttpResponseFor<IntegratorSettingUpdateAppNameResponse> =
            updateAppName(params, RequestOptions.none())

        /** @see updateAppName */
        @MustBeClosed
        fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingUpdateAppNameResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/settings/event-visibility`, but is otherwise the same as
         * [IntegratorSettingService.updateEventVisibilitySettings].
         */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        ): HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
            updateEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            appId: String,
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
            updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateEventVisibilitySettings */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams
        ): HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
            updateEventVisibilitySettings(params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        @MustBeClosed
        fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise the
         * same as [IntegratorSettingService.updateOembedDomain].
         */
        @MustBeClosed
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingUpdateOembedDomainParams,
        ): HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse> =
            updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see updateOembedDomain */
        @MustBeClosed
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse> =
            updateOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see updateOembedDomain */
        @MustBeClosed
        fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams
        ): HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse> =
            updateOembedDomain(params, RequestOptions.none())

        /** @see updateOembedDomain */
        @MustBeClosed
        fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse>
    }
}
