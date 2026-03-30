// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.owners.OwnerGetParams
import com.hubspot_sdk.api.models.crm.owners.OwnerListPage
import com.hubspot_sdk.api.models.crm.owners.OwnerListParams
import com.hubspot_sdk.api.models.crm.owners.PublicOwner
import java.util.function.Consumer

interface OwnerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OwnerService

    fun list(): OwnerListPage = list(OwnerListParams.none())

    /** @see list */
    fun list(
        params: OwnerListParams = OwnerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OwnerListPage

    /** @see list */
    fun list(params: OwnerListParams = OwnerListParams.none()): OwnerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OwnerListPage =
        list(OwnerListParams.none(), requestOptions)

    /** Retrieve details of a specific owner using either their 'id' or 'userId'. */
    fun get(ownerId: Int): PublicOwner = get(ownerId, OwnerGetParams.none())

    /** @see get */
    fun get(
        ownerId: Int,
        params: OwnerGetParams = OwnerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicOwner = get(params.toBuilder().ownerId(ownerId).build(), requestOptions)

    /** @see get */
    fun get(ownerId: Int, params: OwnerGetParams = OwnerGetParams.none()): PublicOwner =
        get(ownerId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OwnerGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicOwner

    /** @see get */
    fun get(params: OwnerGetParams): PublicOwner = get(params, RequestOptions.none())

    /** @see get */
    fun get(ownerId: Int, requestOptions: RequestOptions): PublicOwner =
        get(ownerId, OwnerGetParams.none(), requestOptions)

    /** A view of [OwnerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OwnerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/owners/2026-03`, but is otherwise the same as
         * [OwnerService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<OwnerListPage> = list(OwnerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OwnerListParams = OwnerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OwnerListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OwnerListParams = OwnerListParams.none()): HttpResponseFor<OwnerListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OwnerListPage> =
            list(OwnerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/owners/2026-03/{ownerId}`, but is otherwise the
         * same as [OwnerService.get].
         */
        @MustBeClosed
        fun get(ownerId: Int): HttpResponseFor<PublicOwner> = get(ownerId, OwnerGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            ownerId: Int,
            params: OwnerGetParams = OwnerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicOwner> =
            get(params.toBuilder().ownerId(ownerId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            ownerId: Int,
            params: OwnerGetParams = OwnerGetParams.none(),
        ): HttpResponseFor<PublicOwner> = get(ownerId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OwnerGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicOwner>

        /** @see get */
        @MustBeClosed
        fun get(params: OwnerGetParams): HttpResponseFor<PublicOwner> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(ownerId: Int, requestOptions: RequestOptions): HttpResponseFor<PublicOwner> =
            get(ownerId, OwnerGetParams.none(), requestOptions)
    }
}
