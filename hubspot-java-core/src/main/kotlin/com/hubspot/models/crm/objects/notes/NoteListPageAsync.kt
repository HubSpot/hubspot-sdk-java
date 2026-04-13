// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.notes

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.services.async.crm.objects.NoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see NoteServiceAsync.list */
class NoteListPageAsync
private constructor(
    private val service: NoteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NoteListParams,
    private val response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging,
) : PageAsync<SimplePublicObjectWithAssociations> {

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.results
     */
    fun results(): List<SimplePublicObjectWithAssociations> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<SimplePublicObjectWithAssociations> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): NoteListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<NoteListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplePublicObjectWithAssociations> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSimplePublicObjectWithAssociationsForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NoteListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NoteListPageAsync]. */
    class Builder internal constructor() {

        private var service: NoteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NoteListParams? = null
        private var response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(noteListPageAsync: NoteListPageAsync) = apply {
            service = noteListPageAsync.service
            streamHandlerExecutor = noteListPageAsync.streamHandlerExecutor
            params = noteListPageAsync.params
            response = noteListPageAsync.response
        }

        fun service(service: NoteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [NoteListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NoteListPageAsync =
            NoteListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NoteListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NoteListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
