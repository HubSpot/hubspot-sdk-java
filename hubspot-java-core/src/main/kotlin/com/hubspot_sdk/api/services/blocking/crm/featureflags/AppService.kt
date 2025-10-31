// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateResponse
import java.util.function.Consumer

interface AppService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppService

    /**
     * Set a feature flag for an app. For example, update the `hs-hide-crm-cards` flag's
     * `defaultState` to `ON` to hide classic CRM cards from new installs.
     */
    fun update(flagName: String, params: AppUpdateParams): AppUpdateResponse =
        update(flagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        flagName: String,
        params: AppUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppUpdateResponse = update(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see update */
    fun update(params: AppUpdateParams): AppUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AppUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppUpdateResponse

    /**
     * Delete a feature flag in an app. For example, delete the `hs-release-app-cards` flag after
     * all accounts have been migrated.
     */
    fun delete(flagName: String, params: AppDeleteParams): AppDeleteResponse =
        delete(flagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flagName: String,
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppDeleteResponse = delete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: AppDeleteParams): AppDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppDeleteResponse

    /** Retrieve the current status of the app's feature flags. No request body is included. */
    fun get(flagName: String, params: AppGetParams): AppGetResponse =
        get(flagName, params, RequestOptions.none())

    /** @see get */
    fun get(
        flagName: String,
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppGetResponse = get(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see get */
    fun get(params: AppGetParams): AppGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppGetResponse

    /**
     * Retrieve a list of HubSpot accounts with an account-level flag setting for the specified app.
     * No request body is included.
     */
    fun listPortals(flagName: String, params: AppListPortalsParams): AppListPortalsResponse =
        listPortals(flagName, params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        flagName: String,
        params: AppListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppListPortalsResponse =
        listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see listPortals */
    fun listPortals(params: AppListPortalsParams): AppListPortalsResponse =
        listPortals(params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        params: AppListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppListPortalsResponse

    /** A view of [AppService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /feature-flags/v3/{appId}/flags/{flagName}`, but is
         * otherwise the same as [AppService.update].
         */
        @MustBeClosed
        fun update(flagName: String, params: AppUpdateParams): HttpResponseFor<AppUpdateResponse> =
            update(flagName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            flagName: String,
            params: AppUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppUpdateResponse> =
            update(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AppUpdateParams): HttpResponseFor<AppUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AppUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /feature-flags/v3/{appId}/flags/{flagName}`, but
         * is otherwise the same as [AppService.delete].
         */
        @MustBeClosed
        fun delete(flagName: String, params: AppDeleteParams): HttpResponseFor<AppDeleteResponse> =
            delete(flagName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            flagName: String,
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppDeleteResponse> =
            delete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AppDeleteParams): HttpResponseFor<AppDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /feature-flags/v3/{appId}/flags/{flagName}`, but is
         * otherwise the same as [AppService.get].
         */
        @MustBeClosed
        fun get(flagName: String, params: AppGetParams): HttpResponseFor<AppGetResponse> =
            get(flagName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            flagName: String,
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppGetResponse> =
            get(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: AppGetParams): HttpResponseFor<AppGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppGetResponse>

        /**
         * Returns a raw HTTP response for `get /feature-flags/v3/{appId}/flags/{flagName}/portals`,
         * but is otherwise the same as [AppService.listPortals].
         */
        @MustBeClosed
        fun listPortals(
            flagName: String,
            params: AppListPortalsParams,
        ): HttpResponseFor<AppListPortalsResponse> =
            listPortals(flagName, params, RequestOptions.none())

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            flagName: String,
            params: AppListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppListPortalsResponse> =
            listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(params: AppListPortalsParams): HttpResponseFor<AppListPortalsResponse> =
            listPortals(params, RequestOptions.none())

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            params: AppListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppListPortalsResponse>
    }
}
