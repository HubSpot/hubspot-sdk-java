// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.notes

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.crm.CollectionResponseSimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.services.blocking.crm.objects.NoteService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see NoteService.list */
class NoteListPage
private constructor(
    private val service: NoteService,
    private val params: NoteListParams,
    private val response: CollectionResponseSimplePublicObjectWithAssociations,
) : Page<SimplePublicObjectWithAssociations> {

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociations], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociations.results
     */
    fun results(): List<SimplePublicObjectWithAssociations> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociations], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociations.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

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

    override fun nextPage(): NoteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimplePublicObjectWithAssociations> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSimplePublicObjectWithAssociations = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NoteListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NoteListPage]. */
    class Builder internal constructor() {

        private var service: NoteService? = null
        private var params: NoteListParams? = null
        private var response: CollectionResponseSimplePublicObjectWithAssociations? = null

        @JvmSynthetic
        internal fun from(noteListPage: NoteListPage) = apply {
            service = noteListPage.service
            params = noteListPage.params
            response = noteListPage.response
        }

        fun service(service: NoteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSimplePublicObjectWithAssociations) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NoteListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NoteListPage =
            NoteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NoteListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "NoteListPage{service=$service, params=$params, response=$response}"
}
