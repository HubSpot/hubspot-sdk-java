// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListAllParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.FlagsForAppResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateResponse
import com.hubspot_sdk.api.services.blocking.crm.featureflags.BatchService
import java.util.function.Consumer

interface FeatureFlagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagService

    fun batch(): BatchService

    /** Specify an account-level flag state for a specific HubSpot account. */
    fun update(portalId: Int, params: FeatureFlagUpdateParams): PortalFlagStateResponse =
        update(portalId, params, RequestOptions.none())

    /** @see update */
    fun update(
        portalId: Int,
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        update(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see update */
    fun update(params: FeatureFlagUpdateParams): PortalFlagStateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun delete(portalId: Int, params: FeatureFlagDeleteParams): PortalFlagStateResponse =
        delete(portalId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        portalId: Int,
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        delete(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FeatureFlagDeleteParams): PortalFlagStateResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun get(portalId: Int, params: FeatureFlagGetParams): PortalFlagStateResponse =
        get(portalId, params, RequestOptions.none())

    /** @see get */
    fun get(
        portalId: Int,
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse = get(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see get */
    fun get(params: FeatureFlagGetParams): PortalFlagStateResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    fun listAll(appId: Int): FlagsForAppResponse = listAll(appId, FeatureFlagListAllParams.none())

    /** @see listAll */
    fun listAll(
        appId: Int,
        params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagsForAppResponse = listAll(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listAll */
    fun listAll(
        appId: Int,
        params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
    ): FlagsForAppResponse = listAll(appId, params, RequestOptions.none())

    /** @see listAll */
    fun listAll(
        params: FeatureFlagListAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagsForAppResponse

    /** @see listAll */
    fun listAll(params: FeatureFlagListAllParams): FlagsForAppResponse =
        listAll(params, RequestOptions.none())

    /** @see listAll */
    fun listAll(appId: Int, requestOptions: RequestOptions): FlagsForAppResponse =
        listAll(appId, FeatureFlagListAllParams.none(), requestOptions)

    /**
     * Retrieve a list of HubSpot accounts with an account-level flag setting for the specified app.
     * No request body is included.
     */
    fun listPortals(
        flagName: String,
        params: FeatureFlagListPortalsParams,
    ): PortalFlagStateBatchResponse = listPortals(flagName, params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        flagName: String,
        params: FeatureFlagListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse =
        listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see listPortals */
    fun listPortals(params: FeatureFlagListPortalsParams): PortalFlagStateBatchResponse =
        listPortals(params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        params: FeatureFlagListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse

    /**
     * A view of [FeatureFlagService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureFlagService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagService.update].
         */
        @MustBeClosed
        fun update(
            portalId: Int,
            params: FeatureFlagUpdateParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            update(portalId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            portalId: Int,
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            update(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FeatureFlagUpdateParams): HttpResponseFor<PortalFlagStateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagService.delete].
         */
        @MustBeClosed
        fun delete(
            portalId: Int,
            params: FeatureFlagDeleteParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            delete(portalId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            portalId: Int,
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            delete(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: FeatureFlagDeleteParams): HttpResponseFor<PortalFlagStateResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagService.get].
         */
        @MustBeClosed
        fun get(
            portalId: Int,
            params: FeatureFlagGetParams,
        ): HttpResponseFor<PortalFlagStateResponse> = get(portalId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            portalId: Int,
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            get(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: FeatureFlagGetParams): HttpResponseFor<PortalFlagStateResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>

        /**
         * Returns a raw HTTP response for `get /feature-flags/2026-03/{appId}/flags/all`, but is
         * otherwise the same as [FeatureFlagService.listAll].
         */
        @MustBeClosed
        fun listAll(appId: Int): HttpResponseFor<FlagsForAppResponse> =
            listAll(appId, FeatureFlagListAllParams.none())

        /** @see listAll */
        @MustBeClosed
        fun listAll(
            appId: Int,
            params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagsForAppResponse> =
            listAll(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listAll */
        @MustBeClosed
        fun listAll(
            appId: Int,
            params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
        ): HttpResponseFor<FlagsForAppResponse> = listAll(appId, params, RequestOptions.none())

        /** @see listAll */
        @MustBeClosed
        fun listAll(
            params: FeatureFlagListAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagsForAppResponse>

        /** @see listAll */
        @MustBeClosed
        fun listAll(params: FeatureFlagListAllParams): HttpResponseFor<FlagsForAppResponse> =
            listAll(params, RequestOptions.none())

        /** @see listAll */
        @MustBeClosed
        fun listAll(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlagsForAppResponse> =
            listAll(appId, FeatureFlagListAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals`, but is otherwise the same as
         * [FeatureFlagService.listPortals].
         */
        @MustBeClosed
        fun listPortals(
            flagName: String,
            params: FeatureFlagListPortalsParams,
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            listPortals(flagName, params, RequestOptions.none())

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            flagName: String,
            params: FeatureFlagListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            params: FeatureFlagListPortalsParams
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            listPortals(params, RequestOptions.none())

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            params: FeatureFlagListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse>
    }
}
