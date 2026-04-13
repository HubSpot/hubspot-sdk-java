// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailCreateParams
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailDeleteParams
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailGetParams
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailListPage
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailListParams
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailSearchParams
import com.hubspot.sdk.models.crm.objects.postalmail.PostalMailUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.postalmail.BatchService
import java.util.function.Consumer

interface PostalMailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalMailService

    fun batch(): BatchService

    /**
     * Create a postal mail object with the given properties and return a copy of the object,
     * including the ID.
     */
    fun create(params: PostalMailCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostalMailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            PostalMailCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    fun update(postalMailId: String, params: PostalMailUpdateParams): SimplePublicObject =
        update(postalMailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        postalMailId: String,
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see update */
    fun update(params: PostalMailUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    fun list(): PostalMailListPage = list(PostalMailListParams.none())

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostalMailListPage

    /** @see list */
    fun list(params: PostalMailListParams = PostalMailListParams.none()): PostalMailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PostalMailListPage =
        list(PostalMailListParams.none(), requestOptions)

    /** Move the postal mail object with the ID `{postalMailId}` to the recycling bin. */
    fun delete(postalMailId: String) = delete(postalMailId, PostalMailDeleteParams.none())

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
    ) = delete(postalMailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostalMailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: PostalMailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(postalMailId: String, requestOptions: RequestOptions) =
        delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

    fun get(postalMailId: String): SimplePublicObjectWithAssociations =
        get(postalMailId, PostalMailGetParams.none())

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(postalMailId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostalMailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: PostalMailGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        postalMailId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(postalMailId, PostalMailGetParams.none(), requestOptions)

    /** Search for postal mail objects using specific criteria in the request. */
    fun search(params: PostalMailSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PostalMailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            PostalMailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [PostalMailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalMailService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail`, but is otherwise
         * the same as [PostalMailService.create].
         */
        @MustBeClosed
        fun create(params: PostalMailCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PostalMailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                PostalMailCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/postal_mail/{postalMailId}`,
         * but is otherwise the same as [PostalMailService.update].
         */
        @MustBeClosed
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(postalMailId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PostalMailUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/postal_mail`, but is otherwise
         * the same as [PostalMailService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PostalMailListPage> = list(PostalMailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostalMailListParams = PostalMailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostalMailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostalMailListParams = PostalMailListParams.none()
        ): HttpResponseFor<PostalMailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PostalMailListPage> =
            list(PostalMailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/postal_mail/{postalMailId}`,
         * but is otherwise the same as [PostalMailService.delete].
         */
        @MustBeClosed
        fun delete(postalMailId: String): HttpResponse =
            delete(postalMailId, PostalMailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        ): HttpResponse = delete(postalMailId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PostalMailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PostalMailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(postalMailId: String, requestOptions: RequestOptions): HttpResponse =
            delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/postal_mail/{postalMailId}`,
         * but is otherwise the same as [PostalMailService.get].
         */
        @MustBeClosed
        fun get(postalMailId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(postalMailId, PostalMailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(postalMailId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PostalMailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: PostalMailGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            postalMailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(postalMailId, PostalMailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/search`, but is
         * otherwise the same as [PostalMailService.search].
         */
        @MustBeClosed
        fun search(
            params: PostalMailSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: PostalMailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                PostalMailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
