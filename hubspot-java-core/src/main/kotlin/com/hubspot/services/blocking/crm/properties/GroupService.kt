// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.properties

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.CollectionResponsePropertyGroupNoPaging
import com.hubspot.models.PropertyGroup
import com.hubspot.models.crm.properties.groups.GroupCreateParams
import com.hubspot.models.crm.properties.groups.GroupDeleteParams
import com.hubspot.models.crm.properties.groups.GroupGetParams
import com.hubspot.models.crm.properties.groups.GroupListParams
import com.hubspot.models.crm.properties.groups.GroupUpdateParams
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Create and return a copy of a new property group. */
    fun create(objectType: String, params: GroupCreateParams): PropertyGroup =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: GroupCreateParams): PropertyGroup = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /**
     * Perform a partial update of a property group identified by {groupName}. Provided fields will
     * be overwritten.
     */
    fun update(groupName: String, params: GroupUpdateParams): PropertyGroup =
        update(groupName, params, RequestOptions.none())

    /** @see update */
    fun update(
        groupName: String,
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = update(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see update */
    fun update(params: GroupUpdateParams): PropertyGroup = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** Read all existing property groups for the specified object type and HubSpot account. */
    fun list(objectType: String): CollectionResponsePropertyGroupNoPaging =
        list(objectType, GroupListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyGroupNoPaging =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams = GroupListParams.none(),
    ): CollectionResponsePropertyGroupNoPaging = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyGroupNoPaging

    /** @see list */
    fun list(params: GroupListParams): CollectionResponsePropertyGroupNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePropertyGroupNoPaging =
        list(objectType, GroupListParams.none(), requestOptions)

    /** Move a property group identified by {groupName} to the recycling bin. */
    fun delete(groupName: String, params: GroupDeleteParams) =
        delete(groupName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        groupName: String,
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see delete */
    fun delete(params: GroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Read a property group identified by {groupName}. */
    fun get(groupName: String, params: GroupGetParams): PropertyGroup =
        get(groupName, params, RequestOptions.none())

    /** @see get */
    fun get(
        groupName: String,
        params: GroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = get(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see get */
    fun get(params: GroupGetParams): PropertyGroup = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/properties/2026-03/{objectType}/groups`, but
         * is otherwise the same as [GroupService.create].
         */
        @MustBeClosed
        fun create(objectType: String, params: GroupCreateParams): HttpResponseFor<PropertyGroup> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<PropertyGroup> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/properties/2026-03/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupService.update].
         */
        @MustBeClosed
        fun update(groupName: String, params: GroupUpdateParams): HttpResponseFor<PropertyGroup> =
            update(groupName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupName: String,
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            update(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: GroupUpdateParams): HttpResponseFor<PropertyGroup> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `get /crm/properties/2026-03/{objectType}/groups`, but is
         * otherwise the same as [GroupService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            list(objectType, GroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: GroupListParams = GroupListParams.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> =
            list(objectType, GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/properties/2026-03/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupService.delete].
         */
        @MustBeClosed
        fun delete(groupName: String, params: GroupDeleteParams): HttpResponse =
            delete(groupName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupName: String,
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/properties/2026-03/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupService.get].
         */
        @MustBeClosed
        fun get(groupName: String, params: GroupGetParams): HttpResponseFor<PropertyGroup> =
            get(groupName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            groupName: String,
            params: GroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            get(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: GroupGetParams): HttpResponseFor<PropertyGroup> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>
    }
}
