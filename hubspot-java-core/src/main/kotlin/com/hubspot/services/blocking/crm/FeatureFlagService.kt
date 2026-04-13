// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot.models.crm.featureflags.FeatureFlagDeletePortalStateParams
import com.hubspot.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot.models.crm.featureflags.FeatureFlagGetPortalStateParams
import com.hubspot.models.crm.featureflags.FeatureFlagListAllParams
import com.hubspot.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot.models.crm.featureflags.FeatureFlagUpdatePortalStateParams
import com.hubspot.models.crm.featureflags.FlagResponse
import com.hubspot.models.crm.featureflags.FlagsForAppResponse
import com.hubspot.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot.models.crm.featureflags.PortalFlagStateResponse
import com.hubspot.services.blocking.crm.featureflags.BatchService
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

    /**
     * Set a feature flag for an app. For example, update the `hs-hide-crm-cards` flag's
     * `defaultState` to `ON` to hide classic CRM cards from new installs.
     */
    fun update(flagName: String, params: FeatureFlagUpdateParams): FlagResponse =
        update(flagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        flagName: String,
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse = update(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see update */
    fun update(params: FeatureFlagUpdateParams): FlagResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse

    /**
     * Delete a feature flag in an app. For example, delete the `hs-release-app-cards` flag after
     * all accounts have been migrated.
     */
    fun delete(flagName: String, params: FeatureFlagDeleteParams): FlagResponse =
        delete(flagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flagName: String,
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse = delete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: FeatureFlagDeleteParams): FlagResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun deletePortalState(
        portalId: Int,
        params: FeatureFlagDeletePortalStateParams,
    ): PortalFlagStateResponse = deletePortalState(portalId, params, RequestOptions.none())

    /** @see deletePortalState */
    fun deletePortalState(
        portalId: Int,
        params: FeatureFlagDeletePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        deletePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortalState */
    fun deletePortalState(params: FeatureFlagDeletePortalStateParams): PortalFlagStateResponse =
        deletePortalState(params, RequestOptions.none())

    /** @see deletePortalState */
    fun deletePortalState(
        params: FeatureFlagDeletePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    /** Retrieve the current status of the app's feature flags. No request body is included. */
    fun get(flagName: String, params: FeatureFlagGetParams): FlagResponse =
        get(flagName, params, RequestOptions.none())

    /** @see get */
    fun get(
        flagName: String,
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse = get(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see get */
    fun get(params: FeatureFlagGetParams): FlagResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun getPortalState(
        portalId: Int,
        params: FeatureFlagGetPortalStateParams,
    ): PortalFlagStateResponse = getPortalState(portalId, params, RequestOptions.none())

    /** @see getPortalState */
    fun getPortalState(
        portalId: Int,
        params: FeatureFlagGetPortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        getPortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see getPortalState */
    fun getPortalState(params: FeatureFlagGetPortalStateParams): PortalFlagStateResponse =
        getPortalState(params, RequestOptions.none())

    /** @see getPortalState */
    fun getPortalState(
        params: FeatureFlagGetPortalStateParams,
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

    /** Specify an account-level flag state for a specific HubSpot account. */
    fun updatePortalState(
        portalId: Int,
        params: FeatureFlagUpdatePortalStateParams,
    ): PortalFlagStateResponse = updatePortalState(portalId, params, RequestOptions.none())

    /** @see updatePortalState */
    fun updatePortalState(
        portalId: Int,
        params: FeatureFlagUpdatePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        updatePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see updatePortalState */
    fun updatePortalState(params: FeatureFlagUpdatePortalStateParams): PortalFlagStateResponse =
        updatePortalState(params, RequestOptions.none())

    /** @see updatePortalState */
    fun updatePortalState(
        params: FeatureFlagUpdatePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

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
         * Returns a raw HTTP response for `put /feature-flags/2026-03/{appId}/flags/{flagName}`,
         * but is otherwise the same as [FeatureFlagService.update].
         */
        @MustBeClosed
        fun update(
            flagName: String,
            params: FeatureFlagUpdateParams,
        ): HttpResponseFor<FlagResponse> = update(flagName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            flagName: String,
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse> =
            update(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FeatureFlagUpdateParams): HttpResponseFor<FlagResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse>

        /**
         * Returns a raw HTTP response for `delete /feature-flags/2026-03/{appId}/flags/{flagName}`,
         * but is otherwise the same as [FeatureFlagService.delete].
         */
        @MustBeClosed
        fun delete(
            flagName: String,
            params: FeatureFlagDeleteParams,
        ): HttpResponseFor<FlagResponse> = delete(flagName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            flagName: String,
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse> =
            delete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: FeatureFlagDeleteParams): HttpResponseFor<FlagResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagService.deletePortalState].
         */
        @MustBeClosed
        fun deletePortalState(
            portalId: Int,
            params: FeatureFlagDeletePortalStateParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            deletePortalState(portalId, params, RequestOptions.none())

        /** @see deletePortalState */
        @MustBeClosed
        fun deletePortalState(
            portalId: Int,
            params: FeatureFlagDeletePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            deletePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortalState */
        @MustBeClosed
        fun deletePortalState(
            params: FeatureFlagDeletePortalStateParams
        ): HttpResponseFor<PortalFlagStateResponse> =
            deletePortalState(params, RequestOptions.none())

        /** @see deletePortalState */
        @MustBeClosed
        fun deletePortalState(
            params: FeatureFlagDeletePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>

        /**
         * Returns a raw HTTP response for `get /feature-flags/2026-03/{appId}/flags/{flagName}`,
         * but is otherwise the same as [FeatureFlagService.get].
         */
        @MustBeClosed
        fun get(flagName: String, params: FeatureFlagGetParams): HttpResponseFor<FlagResponse> =
            get(flagName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            flagName: String,
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse> =
            get(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: FeatureFlagGetParams): HttpResponseFor<FlagResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagService.getPortalState].
         */
        @MustBeClosed
        fun getPortalState(
            portalId: Int,
            params: FeatureFlagGetPortalStateParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            getPortalState(portalId, params, RequestOptions.none())

        /** @see getPortalState */
        @MustBeClosed
        fun getPortalState(
            portalId: Int,
            params: FeatureFlagGetPortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            getPortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see getPortalState */
        @MustBeClosed
        fun getPortalState(
            params: FeatureFlagGetPortalStateParams
        ): HttpResponseFor<PortalFlagStateResponse> = getPortalState(params, RequestOptions.none())

        /** @see getPortalState */
        @MustBeClosed
        fun getPortalState(
            params: FeatureFlagGetPortalStateParams,
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

        /**
         * Returns a raw HTTP response for `put
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagService.updatePortalState].
         */
        @MustBeClosed
        fun updatePortalState(
            portalId: Int,
            params: FeatureFlagUpdatePortalStateParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            updatePortalState(portalId, params, RequestOptions.none())

        /** @see updatePortalState */
        @MustBeClosed
        fun updatePortalState(
            portalId: Int,
            params: FeatureFlagUpdatePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            updatePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see updatePortalState */
        @MustBeClosed
        fun updatePortalState(
            params: FeatureFlagUpdatePortalStateParams
        ): HttpResponseFor<PortalFlagStateResponse> =
            updatePortalState(params, RequestOptions.none())

        /** @see updatePortalState */
        @MustBeClosed
        fun updatePortalState(
            params: FeatureFlagUpdatePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>
    }
}
